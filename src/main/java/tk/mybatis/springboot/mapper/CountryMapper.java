package tk.mybatis.springboot.mapper;

import org.apache.ibatis.annotations.Mapper;
import tk.mybatis.springboot.model.Country;

import java.util.List;

/**
 * @author peng.li
 * @Description: TODO
 * @date 2020/7/31 9:59
 */
@Mapper
public interface CountryMapper {

    List<Country> selectAll();

}
