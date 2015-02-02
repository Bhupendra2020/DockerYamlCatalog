/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softcrylic.dockeryamlcatalog.controller;

import com.google.gson.Gson;
import com.softcrylic.dockeryamlcatalog.util.FigCommandClassDef;
import com.softcrylic.dockeryamlcatalog.util.YmlBuilder;
import org.json.simple.parser.JSONParser;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author BhupendraKumar
 */
@Controller
@RequestMapping("/rest/v1")
public class tomcat7jdk7 {

    Gson gson = new Gson();
    JSONParser parser = new JSONParser();

    @RequestMapping(value = "/tm7jd7", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    ResponseEntity<String> post_Tomcat7Jdk7_Yml(@RequestBody String inputJson) {

        FigCommandClassDef fccd = new FigCommandClassDef();
        
        StringBuilder sb = new StringBuilder();

        try {
            /**
             * Get the Json and Assigned to class definition
             */
            fccd = gson.fromJson(inputJson, FigCommandClassDef.class);

            /**
             * Check parent should be present
             */
            if (fccd.getContainer_id().equals("") || fccd.getContainer_id().equals(null)) {
                return new ResponseEntity<String>("Container_Id can't be null or left blank", HttpStatus.BAD_REQUEST);
            }

            /**
             * Generate the Yaml
             */
            

            sb = YmlBuilder.buildYaml(fccd);

        } catch (Exception e) {
            return new ResponseEntity<String>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<String>(sb.toString(), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody
    ResponseEntity<String> get_Tomcat7Jdk7_Yml() {

        return new ResponseEntity<String>("You can use this method for posting for Tomcat7 and Jdk 7, Yaml generation", HttpStatus.OK);
    }

}
