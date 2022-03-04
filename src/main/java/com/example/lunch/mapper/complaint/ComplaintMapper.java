package com.example.lunch.mapper.complaint;

import com.example.lunch.entity.complaint.Complaint;
import com.example.lunch.dto.complain.ComplainCreateDto;
import com.example.lunch.dto.complain.ComplainDto;
import com.example.lunch.dto.complain.ComplainUpdateDto;
import com.example.lunch.mapper.BaseMapper;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * shohista
 */
@Component
@Mapper(componentModel = "spring")
public interface ComplaintMapper  extends BaseMapper<
        Complaint,
        ComplainDto,
        ComplainCreateDto,
        ComplainUpdateDto> {
    @Override
    default ComplainDto toDto(Complaint complaint) {
        return null;
    }

    @Override
    default List<ComplainDto> toDto(List<Complaint> e) {
        return null;
    }

    @Override
    default Complaint fromCreateDto(ComplainCreateDto complainCreateDto) {
        return null;
    }

    @Override
    default Complaint fromUpdateDto(ComplainUpdateDto d) {
        return null;
    }
}
