package com.example.lunch.entity.complaint;

import com.example.lunch.entity.Auditable;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Complaint extends Auditable {
    private String text;
    private boolean deleted;
    private Long userId;
}
