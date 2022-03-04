package com.example.lunch.service.complaint;

import com.example.lunch.dto.complain.ComplainCreateDto;
import com.example.lunch.dto.complain.ComplainDto;
import com.example.lunch.dto.complain.ComplainUpdateDto;
import com.example.lunch.entity.complaint.Complaint;
import com.example.lunch.service.BaseService;
import com.example.lunch.service.GenericCrudService;

public interface ComplaintService extends GenericCrudService<
        Complaint,
        ComplainDto,
        ComplainCreateDto,
        ComplainUpdateDto,
        Long>,
        BaseService {
}
