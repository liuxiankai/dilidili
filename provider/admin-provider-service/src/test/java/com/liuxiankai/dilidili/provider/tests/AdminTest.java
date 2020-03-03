package com.liuxiankai.dilidili.provider.tests;


import com.liuxiankai.dilidili.provider.domain.Admin;
import com.liuxiankai.dilidili.provider.mapper.AdminMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AdminTest {
    @Autowired
    private AdminMapper adminMapper;
    @Test
    public void SelectAllTest(){
        List<Admin> admins = adminMapper.selectAll();
        admins.forEach(admin -> {
            System.out.println(admin);
        });
    }
}
