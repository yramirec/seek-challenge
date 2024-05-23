package com.seek.challenge.service;


import com.seek.challenge.entity.Candidate;

import java.util.List;

public interface CandidateService {
    List<Candidate> getAllCandidates();
    Candidate getCandidateById(Long id);
    Candidate saveCandidate(Candidate candidate);
    void deleteCandidate(Long id);
}
