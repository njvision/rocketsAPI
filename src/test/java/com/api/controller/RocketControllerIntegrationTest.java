package com.api.controller;

import com.api.config.RocketsApplication;
import com.api.dto.RocketDto;
import com.api.entity.SxRocket;
import com.api.model.RocketJpa;
import com.api.repository.RocketRepository;
import com.api.service.RocketPresenter;
import com.api.service.RocketService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.jsonPath;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest(classes = RocketsApplication.class)
@AutoConfigureMockMvc
public class RocketControllerIntegrationTest {
//    @Autowired
//    private MockMvc mockMvc;
//
//    @Autowired
//    private RocketRepository rocketRepository;
//
//    @MockBean
//    private RocketPresenter rocketPresenter;
//
//    @MockBean
//    private RocketService rocketService;
//
//    @Test
//    public void testGetAllRockets() throws Exception {
//        RocketDto mockRocketDto = new RocketDto();
//        mockRocketDto.setRocketName("Falcon 9");
        // Set other fields of mockRocketDto...

//        List<RocketDto> mockRocketDtos = Arrays.asList(mockRocketDto);

//        when(rocketPresenter.getAllRockets(null, null, null)).thenReturn(mockRocketDtos);

        // Mock the transformation from RocketDto to SxRocket
        SxRocket mockSxRocket = new SxRocket();
//        mockSxRocket.setRocketName("Falcon 9");
        // Set other fields of mockSxRocket...

//        when(rocketService.getRockets(mockRocketDtos)).thenReturn(Arrays.asList(mockSxRocket));

        // Perform the GET request and verify the results
//        mockMvc.perform(get("/your-endpoint"))  // Use your actual endpoint path
//                .andExpect(status().isOk())
//                .andExpect((ResultMatcher) jsonPath("$[0].rocketName", "Falcon 9"));

        // Verify the data was saved in the database
//        List<RocketJpa> savedRockets = rocketRepository.findAll();
//        assertThat(savedRockets).isNotEmpty();
//        assertThat(savedRockets.get(0).getRocketName()).isEqualTo("Falcon 9");
//    }
}
