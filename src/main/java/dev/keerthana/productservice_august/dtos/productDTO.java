package dev.keerthana.productservice_august.dtos;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class productDTO {
   private String title;
    private  double price;
    private  String description;
    private  String image;
    private  String category;
}
