package com.example;

public class Rq {
    private String cmd;

    public Rq(String cmd) {
        this.cmd = cmd;
    }

    public String getActionName() {

        /*if (cmd.equals("삭제?id=1")) {
            return "삭제";
        }
        if (cmd.equals("수정?id=1")) {
            return "수정";
        }
        return "";*/

        return cmd.split("\\?")[0];
    }

    public String getParam(String key,String defaultValue) {

        String params = cmd.split("\\?")[1];
        for(String param:params.split("&")){
            String[]paramBits=param.split("=");
            String paramKey = paramBits[0];
            if(paramBits.length==1){
                continue;
            }
            String paramValue =paramBits[1];
            if(paramKey.equals(key)) {
                return paramValue;
            }
        }
        return defaultValue;
    }

    public int getparamAsInt(String key,int defaultValue){
        String rst = getParam(key,"");
        try{
            return Integer.parseInt(rst);
        } catch(NumberFormatException e){
            return defaultValue;
        }
    }
}
