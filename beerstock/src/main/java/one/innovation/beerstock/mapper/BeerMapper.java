package one.innovation.beerstock.mapper;

import one.innovation.beerstock.dto.BeerDTO;
import one.innovation.beerstock.entity.Beer;
import one.innovation.beerstock.dto.BeerDTO;
import one.innovation.beerstock.entity.Beer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BeerMapper {

    BeerMapper INSTANCE = Mappers.getMapper(BeerMapper.class);

    Beer toModel(BeerDTO beerDTO);

    BeerDTO toDTO(Beer beer);
}
