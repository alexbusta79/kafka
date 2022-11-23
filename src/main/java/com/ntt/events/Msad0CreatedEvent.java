package com.ntt.events;

import com.ntt.entity.Payload;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class Msad0CreatedEvent extends Event<Payload> {

}
