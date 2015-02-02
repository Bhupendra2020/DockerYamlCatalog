/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softcrylic.dockeryamlcatalog.util;

/**
 *
 * @author BhupendraKumar
 */
public class YmlBuilder {

    public static StringBuilder buildYaml(FigCommandClassDef fccd) {
        StringBuilder sb = new StringBuilder();

        FigCommands figCommands = new FigCommands();

        sb = figCommands.getContainerId(sb, fccd.getContainer_id());

        sb = figCommands.getImage(sb, "image", fccd.getImage());

        sb = figCommands.getCommand(sb, "command", fccd.getCommand());

        sb = figCommands.getLinks(sb, "links", fccd.getLinks());
        
        sb = figCommands.getPorts(sb, "ports", fccd.getPorts());
        
        sb = figCommands.getExpose(sb, "ports", fccd.getExpose());
        
        sb = figCommands.getVolumes(sb, "volumes", fccd.getVolumes());
        
        sb = figCommands.getVolumefrom(sb, "volumes_from", fccd.getVolumes_from());
        
        sb = figCommands.getEnvironment(sb, "environment", fccd.getEnvironment());
        
        sb = figCommands.getDns(sb, "dns", fccd.getDns());
        
        sb = figCommands.getWorkingDir(sb, "working_dir", fccd.getWorking_dir());
        
        sb = figCommands.getEntrypoint(sb, "entrypoint", fccd.getEntrypoint());
        
        sb = figCommands.getUser(sb, "user", fccd.getUser());
        
        sb = figCommands.getHostname(sb, "hostname", fccd.getHostname());
        
        sb = figCommands.getDomainname(sb, "domainname", fccd.getDomainname());
        
        sb = figCommands.getMemoryLimit(sb, "mem_limit", fccd.getMem_limit());
        
        sb = figCommands.getPrivileged(sb, "privileged", fccd.getPrivileged());

        return sb;
    }
}
