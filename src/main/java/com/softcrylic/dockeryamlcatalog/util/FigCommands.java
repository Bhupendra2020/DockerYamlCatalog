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
public class FigCommands {

    /**
     * container_id Command
     *
     * @param sb
     * @param parentName
     * @param cmdname
     * @return
     */
    public StringBuilder getContainerId(StringBuilder sb, String cmdvalue) {

        if (!cmdvalue.equals("")) {
            sb.append("" + cmdvalue + ":\n");
        }
        return sb;
    }

    /**
     * Image command
     *
     * @param sb
     * @param cmdname
     * @param cmdvalue
     * @return
     */
    public StringBuilder getImage(StringBuilder sb, String cmdname, String cmdvalue) {

        if (!cmdvalue.equals("")) {
            sb.append("  image:" + cmdvalue + "\n");
        }
        return sb;
    }

    /**
     * Build Command
     *
     * @param sb
     * @param cmdname
     * @param cmdvalue
     * @return
     */
    public StringBuilder getBuild(StringBuilder sb, String cmdname, String cmdvalue) {

        if (!cmdvalue.equals("")) {
            sb.append("  build:" + cmdvalue + "\n");
        }
        return sb;
    }

    /**
     * CMD Command
     *
     * @param sb
     * @param cmdname
     * @param cmdvalue
     * @return
     */
    public StringBuilder getCommand(StringBuilder sb, String cmdname, String cmdvalue) {

        if (!cmdvalue.equals("")) {
            sb.append("  command:" + cmdvalue + "\n");
        }
        return sb;
    }

    /**
     * links Command
     *
     * @param sb
     * @param cmdname
     * @param lstCmdvalue
     * @return
     */
    public StringBuilder getLinks(StringBuilder sb, String cmdname, List<String> lstCmdvalue) {

        if (lstCmdvalue.size() > 0) {
            sb.append("  " + cmdname + ":\n");
            for (String lnk : lstCmdvalue) {
                sb.append("    - " + lnk + "\n");
            }
        }
        return sb;
    }

    /**
     * Ports Commands
     *
     * @param sb
     * @param cmdname
     * @param lstCmdvalue
     * @return
     */
    public StringBuilder getPorts(StringBuilder sb, String cmdname, List<String> lstCmdvalue) {

        if (lstCmdvalue.size() > 0) {
            sb.append("  " + cmdname + ":\n");
            for (String port : lstCmdvalue) {
                sb.append("    - " + port + "\n");
            }
        }
        return sb;
    }

    /**
     * Expose Command
     *
     * @param sb
     * @param cmdname
     * @param lstCmdvalue
     * @return
     */
    public StringBuilder getExpose(StringBuilder sb, String cmdname, List<String> lstCmdvalue) {

        if (lstCmdvalue.size() > 0) {
            sb.append("  " + cmdname + ":\n");
            for (String expose : lstCmdvalue) {
                sb.append("    - " + expose + "\n");
            }
        }
        return sb;
    }

    /**
     * Volumes Command
     *
     * @param sb
     * @param cmdname
     * @param lstCmdvalue
     * @return
     */
    public StringBuilder getVolumes(StringBuilder sb, String cmdname, List<String> lstCmdvalue) {

        if (lstCmdvalue.size() > 0) {
            sb.append("  " + cmdname + ":\n");
            for (String vol : lstCmdvalue) {
                sb.append("    - " + vol + "\n");
            }
        }
        return sb;
    }

    /**
     * Volume_From Command
     *
     * @param sb
     * @param cmdname
     * @param lstCmdvalue
     * @return
     */
    public StringBuilder getVolumefrom(StringBuilder sb, String cmdname, List<String> lstCmdvalue) {

        if (lstCmdvalue.size() > 0) {
            sb.append("  " + cmdname + ":\n");
            for (String volfrom : lstCmdvalue) {
                sb.append("    - " + volfrom + "\n");
            }
        }
        return sb;
    }

    /**
     * Environment Command
     *
     * @param sb
     * @param cmdname
     * @param lstCmdvalue
     * @return
     */
    public StringBuilder getEnvironment(StringBuilder sb, String cmdname, List<String> lstCmdvalue) {

        if (lstCmdvalue.size() > 0) {
            sb.append("  " + cmdname + ":\n");
            for (String env : lstCmdvalue) {
                sb.append("    - " + env + "\n");
            }
        }
        return sb;
    }

    /**
     * DNS Command
     *
     * @param sb
     * @param cmdname
     * @param lstCmdvalue
     * @return
     */
    public StringBuilder getDns(StringBuilder sb, String cmdname, List<String> lstCmdvalue) {

        if (lstCmdvalue.size() > 0) {
            sb.append("  " + cmdname + ":\n");
            for (String dns : lstCmdvalue) {
                sb.append("    - " + dns + "\n");
            }
        }
        return sb;
    }

    /**
     * working_dir command
     *
     * @param sb
     * @param cmdname
     * @param cmdvalue
     * @return
     */
    public StringBuilder getWorkingDir(StringBuilder sb, String cmdname, String cmdvalue) {

        if (!cmdvalue.equals("")) {
            sb.append("  working_dir:" + cmdvalue + "\n");
        }
        return sb;
    }

    /**
     * entrypoint command
     *
     * @param sb
     * @param cmdname
     * @param cmdvalue
     * @return
     */
    public StringBuilder getEntrypoint(StringBuilder sb, String cmdname, String cmdvalue) {

        if (!cmdvalue.equals("")) {
            sb.append("  entrypoint:" + cmdvalue + "\n");
        }
        return sb;
    }

    /**
     * user command
     *
     * @param sb
     * @param cmdname
     * @param cmdvalue
     * @return
     */
    public StringBuilder getUser(StringBuilder sb, String cmdname, String cmdvalue) {

        if (!cmdvalue.equals("")) {
            sb.append("  user:" + cmdvalue + "\n");
        }
        return sb;
    }

    /**
     * hostname command
     *
     * @param sb
     * @param cmdname
     * @param cmdvalue
     * @return
     */
    public StringBuilder getHostname(StringBuilder sb, String cmdname, String cmdvalue) {

        if (!cmdvalue.equals("")) {
            sb.append("  hostname:" + cmdvalue + "\n");
        }
        return sb;
    }

    /**
     * domainname command
     *
     * @param sb
     * @param cmdname
     * @param cmdvalue
     * @return
     */
    public StringBuilder getDomainname(StringBuilder sb, String cmdname, String cmdvalue) {

        if (!cmdvalue.equals("")) {
            sb.append("  domainname:" + cmdvalue + "\n");
        }
        return sb;
    }

    /**
     * mem_limit command
     *
     * @param sb
     * @param cmdname
     * @param cmdvalue
     * @return
     */
    public StringBuilder getMemoryLimit(StringBuilder sb, String cmdname, String cmdvalue) {

        if (!cmdvalue.equals("")) {
            sb.append("  mem_limit:" + cmdvalue + "\n");
        }
        return sb;
    }

    /**
     * privileged command
     *
     * @param sb
     * @param cmdname
     * @param cmdvalue
     * @return
     */
    public StringBuilder getPrivileged(StringBuilder sb, String cmdname, String cmdvalue) {

        if (!cmdvalue.equals("")) {
            sb.append("  privileged:" + cmdvalue + "\n");
        }
        return sb;
    }

}
