package org.scoula.travel.dao;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TravelDaoImplTest {

    TravelDao dao = new TravelDaoImpl();

    @Test
    void getTotalCount() {
        int count = dao.getTotalCount();

        Assertions.assertTrue(count > 0);
    }

    @Test
    void getDistricts() {
        List<String> list = dao.getDistricts();

        list.forEach(System.out::println);
        Assertions.assertTrue(list.size() > 0);
    }
}