/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dev.com.pojo;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;

/**
 *
 * @author Admin
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Item {

    @JsonSerialize(using = ToStringSerializer.class)
    private ObjectId id;
}
