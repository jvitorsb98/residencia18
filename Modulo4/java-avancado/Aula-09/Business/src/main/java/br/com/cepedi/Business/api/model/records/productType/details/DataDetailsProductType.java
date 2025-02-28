package br.com.cepedi.Business.api.model.records.productType.details;

import br.com.cepedi.Business.api.model.entitys.ProductType;

public record DataDetailsProductType(

    Long id,

    String name

) {

    public DataDetailsProductType(ProductType productType){
        this(productType.getId(), productType.getName());
    }

}
