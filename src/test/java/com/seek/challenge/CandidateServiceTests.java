package com.seek.challenge;

import com.seek.challenge.entity.Candidate;
import com.seek.challenge.repository.CandidateRepository;
import com.seek.challenge.service.CandidateServiceImpl;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

@SpringBootTest
public class CandidateServiceTests {

	@Mock
	private CandidateRepository candidateRepository;

	@InjectMocks
	private CandidateServiceImpl candidateService;

	@Test
	public void testGetCandidateById() {
		MockitoAnnotations.openMocks(this);
		Candidate candidate = new Candidate();
		candidate.setId(1L);
		candidate.setName("John Doe");
		when(candidateRepository.findById(1L)).thenReturn(Optional.of(candidate));

		Candidate found = candidateService.getCandidateById(1L);
		assertNotNull(found);
		assertEquals("John Doe", found.getName());
	}
}