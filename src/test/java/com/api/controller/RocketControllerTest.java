package com.api.controller;

import com.api.dto.RocketDto;
import com.api.presenter.RocketPresenter;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;

import static org.mockito.Mockito.when;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class RocketControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private RocketPresenter rocketPresenter;

    @Test
    public void getAllRocketsWithoutParams() throws Exception {
        List<RocketDto> rocketDtoList = createRocket(1, "Falcon 9", 2, "United States");

        when(rocketPresenter.getAllRockets(null, null, null)).thenReturn(rocketDtoList);

        mockMvc.perform(get("/")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].id").value(rocketDtoList.get(0).getId()))
                .andExpect(jsonPath("$[0].country").value(rocketDtoList.get(0).getCountry()))
                .andExpect(jsonPath("$[0].stages").value(rocketDtoList.get(0).getStages()))
                .andExpect(jsonPath("$[0].rocket_name").value(rocketDtoList.get(0).getRocketName()));
    }

    @Test
    public void getAllRocketsWithParams() throws Exception {
        List<RocketDto> rocketDtoList = createRocket(2, "Falcon 3", 3, "Moldova");

        when(rocketPresenter.getAllRockets(false, 1, null)).thenReturn(rocketDtoList);

        mockMvc.perform(get("/")
                        .param("id", "false")
                        .param("limit", "1")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].id").value(rocketDtoList.get(0).getId()))
                .andExpect(jsonPath("$[0].country").value(rocketDtoList.get(0).getCountry()))
                .andExpect(jsonPath("$[0].stages").value(rocketDtoList.get(0).getStages()))
                .andExpect(jsonPath("$[0].rocket_name").value(rocketDtoList.get(0).getRocketName()));
    }

    private List<RocketDto> createRocket(int id, String name, int stages, String country) {
        RocketDto rocketDto = new RocketDto();
        rocketDto.setId(id);
        rocketDto.setRocketName(name);
        rocketDto.setStages(stages);
        rocketDto.setCountry(country);
        return List.of(rocketDto);
    }
}
