package com.workshop.springsecurity.model;

import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class ResourceModel {

    private Long id;
    private String key;
    private String value;
}
