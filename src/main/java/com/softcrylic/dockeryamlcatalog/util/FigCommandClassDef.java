/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.softcrylic.dockeryamlcatalog.util;

import java.util.List;

/**
 *
 * @author BhupendraKumar
 */
public class FigCommandClassDef {
    
    private String container_id="";
    private String image="";
    private String build="";
    private String command="";
    private List<String> links;
    private List<String> ports;
    private List<String> expose;
    private List<String> volumes;
    private List<String> volumes_from;
    private List<String> environment;
    private List<String> dns;
    private String working_dir="";
    private String entrypoint="";
    private String user="";
    private String hostname="";
    private String domainname="";
    private String mem_limit="";
    private String privileged;

    public String getContainer_id() {
        return container_id;
    }

    public void setContainer_id(String container_id) {
        this.container_id = container_id;
    }
    
    

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getBuild() {
        return build;
    }

    public void setBuild(String build) {
        this.build = build;
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public List<String> getLinks() {
        return links;
    }

    public void setLinks(List<String> links) {
        this.links = links;
    }

    public List<String> getPorts() {
        return ports;
    }

    public void setPorts(List<String> ports) {
        this.ports = ports;
    }

    public List<String> getExpose() {
        return expose;
    }

    public void setExpose(List<String> expose) {
        this.expose = expose;
    }

    public List<String> getVolumes() {
        return volumes;
    }

    public void setVolumes(List<String> volumes) {
        this.volumes = volumes;
    }

    public List<String> getVolumes_from() {
        return volumes_from;
    }

    public void setVolumes_from(List<String> volumes_from) {
        this.volumes_from = volumes_from;
    }

    public List<String> getEnvironment() {
        return environment;
    }

    public void setEnvironment(List<String> environment) {
        this.environment = environment;
    }

    public List<String> getDns() {
        return dns;
    }

    public void setDns(List<String> dns) {
        this.dns = dns;
    }

    public String getWorking_dir() {
        return working_dir;
    }

    public void setWorking_dir(String working_dir) {
        this.working_dir = working_dir;
    }

    public String getEntrypoint() {
        return entrypoint;
    }

    public void setEntrypoint(String entrypoint) {
        this.entrypoint = entrypoint;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public String getDomainname() {
        return domainname;
    }

    public void setDomainname(String domainname) {
        this.domainname = domainname;
    }

    public String getMem_limit() {
        return mem_limit;
    }

    public void setMem_limit(String mem_limit) {
        this.mem_limit = mem_limit;
    }

    public String getPrivileged() {
        return privileged;
    }

    public void setPrivileged(String privileged) {
        this.privileged = privileged;
    }

    @Override
    public String toString() {
        return "FigCommandClassDef{" + "container_id=" + container_id + ", image=" + image + ", build=" + build + ", command=" + command + ", links=" + links + ", ports=" + ports + ", expose=" + expose + ", volumes=" + volumes + ", volumes_from=" + volumes_from + ", environment=" + environment + ", dns=" + dns + ", working_dir=" + working_dir + ", entrypoint=" + entrypoint + ", user=" + user + ", hostname=" + hostname + ", domainname=" + domainname + ", mem_limit=" + mem_limit + ", privileged=" + privileged + '}';
    }

    
}
