package com.springapp.mvc;

import com.springapp.mvc.dao.ClassinfoMapper;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ABCDC on 2016/8/16.
 */
public class Generator {

    public static void main(String [] args) {
        try {
            List<String> warnings = new ArrayList<String>();
            ConfigurationParser cp = new ConfigurationParser(warnings);
            File configFile = new File("C:\\Users\\ABCDC\\IdeaProjects\\sabc\\src\\main\\java\\config.xml");
            Configuration config = cp.parseConfiguration(configFile);
            DefaultShellCallback callback = new DefaultShellCallback(true);
            MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
            myBatisGenerator.generate(null);
            System.out.println(warnings);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
