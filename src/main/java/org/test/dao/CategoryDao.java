package org.test.dao;

import org.springframework.stereotype.Repository;
import org.test.entity.Category;

import java.util.List;

/**
 * @author marshmello
 * @apiNote CategoryDao
 * @tips @Repository将DAO类声明为Bean
 */
@Repository
public interface CategoryDao {
    List<Category> getCategorys();

}
