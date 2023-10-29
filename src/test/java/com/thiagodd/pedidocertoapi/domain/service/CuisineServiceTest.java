package com.thiagodd.pedidocertoapi.domain.service;

import com.thiagodd.pedidocertoapi.domain.mapper.CuisineMapper;
import com.thiagodd.pedidocertoapi.domain.model.Cuisine;
import com.thiagodd.pedidocertoapi.domain.model.dto.CuisineDto;
import com.thiagodd.pedidocertoapi.domain.repository.CuisineRepository;
import jakarta.persistence.EntityNotFoundException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CuisineServiceTest {

    @Autowired
    private CuisineRepository cuisineRepository;

    @Autowired
    private CuisineService cuisineService;

    @Autowired
    private CuisineMapper mapper;

    private final List<UUID> VALID_ID = new ArrayList<>();


    @BeforeEach
    public void setUp() {
        cuisineRepository.deleteAll();

        List<Cuisine> cuisines = new ArrayList<>();

        Cuisine brazilian = new Cuisine("Brasileira");
        brazilian.setCreatedBy("Default");
        Cuisine italian = new Cuisine("Italiana");
        italian.setCreatedBy("Default");
        Cuisine japanese = new Cuisine("Japonesa");
        japanese.setCreatedBy("Default");

        cuisines.add(brazilian);
        cuisines.add(italian);
        cuisines.add(japanese);

        cuisineRepository.saveAll(cuisines);

        VALID_ID.add(brazilian.getId());
        VALID_ID.add(italian.getId());
        VALID_ID.add(japanese.getId());
    }

    @Test
    @DisplayName("Checks whether it is possible to create a new cuisine with valid data.")
    public void shouldBeAbleToCreateNewCuisineWithValidData(){

        //Given
        Cuisine cuisine = new Cuisine("Mexicana");
        cuisine.setCreatedBy("Default");

        // When
        CuisineDto createdCuisine = cuisineService.create(mapper.toDto(cuisine));

        // Then
        assertNotNull(createdCuisine);
        assertEquals("Mexicana", createdCuisine.getName());
    }

    @Test
    @DisplayName("Checks that it is not possible to create a new cuisine with invalid data.")
    public void shouldNotBeAbleToCreateNewCuisineWithInvalidData(){
        // Given
        Cuisine cuisine = new Cuisine();

        // When
        // Then
        assertThrows(Exception.class, () -> cuisineService.create(mapper.toDto(cuisine)));
    }

    @Test
    @DisplayName("Checks if it is possible to list cuisines with pagination.")
    public void shouldBeAbleToListCuisinesWithPagination(){
        // Given
        int pageNumber = 0;
        int pageSize = 10;

        // When
        Page<CuisineDto> cuisines = cuisineService.findAll(PageRequest.of(pageNumber, pageSize));

        // Then
        assertNotNull(cuisines);
        assertEquals(3, cuisines.getContent().size());
    }

    @Test
    @DisplayName("Checks if it is possible to find a cuisine by ID.")
    public void shouldBeAbleToFindCuisineByID(){
        // Given
        var validId = VALID_ID.get(0);

        // When
        var cuisine = cuisineService.findById(validId);

        // Then
        assertNotNull(cuisine);
        assertEquals("Brasileira", cuisine.getName());
    }

    @Test
    @DisplayName("Checks whether an exception is thrown if the cuisine is not found.")
    public void shouldReturnErrorIfCuisineIsNotFound(){
        // Given
        UUID id = UUID.randomUUID();

        // When
        // Then
        assertThrows(EntityNotFoundException.class, () -> cuisineService.findById(id));
    }

    @Test
    @DisplayName("Checks whether it is possible to update a cuisine with valid data.")
    public void shouldBeAbleToUpdateCuisineWithValidData(){
        // Given
        var validId = VALID_ID.get(0);
        var cuisineDto = cuisineService.findById(validId);

        var cuisine = mapper.toEntity(cuisineDto);
        cuisine.setName("Alemã");
        cuisineDto = mapper.toDto(cuisine);

        // When
        var updatedCuisine = cuisineService.update(validId, cuisineDto);

        // Then
        assertNotNull(updatedCuisine);
        assertEquals("Alemã", updatedCuisine.getName());
    }

    @Test
    @DisplayName("Checks if it is not possible to update a cuisine with invalid data.")
    public void shouldNotBeAbleToUpdateCuisineWithInvalidData(){
        // Given
        var validId =  VALID_ID.get(0);
        var cuisine = cuisineService.findById(validId);

        // When
        cuisine.setName("");
        // Then
        assertThrows(Exception.class, () -> cuisineService.update(validId, cuisine));
    }

    @Test
    @DisplayName("Checks whether it is possible to delete a cuisine.")
    public void shouldBeAbleToDeleteCuisine(){
        UUID id = VALID_ID.get(1);

        cuisineService.delete(id);

        Page<CuisineDto> cuisines = cuisineService.findAll(PageRequest.of(0, 10));

        // Then
        assertEquals(2, cuisines.getContent().size());
    }

    @Test
    @DisplayName("Checks that an exception is not thrown if the cuisine is not found.")
    public void shouldNotReturnErrorIfCuisineIsNotFound(){
        UUID id = UUID.randomUUID();

        cuisineService.delete(id);
        Page<CuisineDto> cuisines = cuisineService.findAll(PageRequest.of(0, 10));

        // Then
        assertEquals(3, cuisines.getContent().size());
    }

//    @Test
//    @DisplayName("Checks whether an exception is thrown if the cuisine is in use.")
//    public void shouldReturnErrorIfCuisineIsInUse(){
//        // Given
//        UUID id = UUID.randomUUID();
//
//        // When
//        // Then
//        assertThrows(Exception.class, () -> cuisineService.delete(id));
//    }
}