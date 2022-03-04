package com.example.lunch.service.complaint;

import com.example.lunch.dto.complain.ComplainCreateDto;
import com.example.lunch.dto.complain.ComplainDto;
import com.example.lunch.dto.complain.ComplainUpdateDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * shohista
 */
@Service("complaintService")
@Slf4j
@RequiredArgsConstructor
@Transactional
public class ComplaintServiceImpl implements ComplaintService {
    @Override
    public Long create(ComplainCreateDto createDto) {
        return null;
    }

    @Override
    public ComplainDto update(Long id, ComplainUpdateDto updateDto) {
        return null;
    }

    @Override
    public Void delete(Long id) {
        return null;
    }

    @Override
    public List<ComplainDto> getAll() {
        return null;
    }

    @Override
    public ComplainDto get(Long id) {
        return null;
    }
}
