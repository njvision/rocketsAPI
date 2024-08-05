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
        RocketDto rocketDto = createRocket(1, "Falcon 9", 2, "United States");
        List<RocketDto> rocketDtoList = List.of(
                rocketDto
        );

        when(rocketPresenter.getAllRockets(null, null, null)).thenReturn(rocketDtoList);

        mockMvc.perform(get("/")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].id").value(rocketDto.getId()))
                .andExpect(jsonPath("$[0].country").value(rocketDto.getCountry()))
                .andExpect(jsonPath("$[0].stages").value(rocketDto.getStages()))
                .andExpect(jsonPath("$[0].rocket_name").value(rocketDto.getRocketName()));
    }

    @Test
    public void getAllRocketsWithParams() throws Exception {
        RocketDto rocketDto = createRocket(2, "Falcon 3", 3, "Moldova");
        List<RocketDto> rocketDtoList = List.of(
                rocketDto
        );

        when(rocketPresenter.getAllRockets(false, 1, null)).thenReturn(rocketDtoList);

        mockMvc.perform(get("/")
                        .param("id", "false")
                        .param("limit", "1")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].id").value(rocketDto.getId()))
                .andExpect(jsonPath("$[0].country").value(rocketDto.getCountry()))
                .andExpect(jsonPath("$[0].stages").value(rocketDto.getStages()))
                .andExpect(jsonPath("$[0].rocket_name").value(rocketDto.getRocketName()));
    }

    private RocketDto createRocket(int id, String name, int stages, String country) {
        RocketDto rocketDto = new RocketDto();
        rocketDto.setId(id);
        rocketDto.setRocketName(name);
        rocketDto.setStages(stages);
        rocketDto.setCountry(country);
        return rocketDto;
    }
}
