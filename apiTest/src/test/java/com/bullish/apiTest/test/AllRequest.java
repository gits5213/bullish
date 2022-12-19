package com.bullish.apiTest.test;

import com.bullish.apiTest.data.Data;
import com.bullish.apiTest.utils.GenericUtil;
import com.bullish.apiTest.utils.MethodUtil;
import io.qameta.allure.Description;
import org.testng.annotations.Test;
import java.util.HashMap;

public class AllRequest extends BaseTest{

    @Test
    @Description("Verify, add new student")
    public void PostStudent(){
        HashMap<String, String> map = new HashMap<>();
        map.put("firstName", GenericUtil.getFirstName());
        map.put("id", GenericUtil.getId());
        map.put("lastName", GenericUtil.getLastName());
        map.put("nationality", GenericUtil.getNationality());
        map.put("studentClass", GenericUtil.getStudentClass());

        MethodUtil.postRes(map, Data.POST_PARAM,Data.SUCCESSFUL_STATUS_CODE);
    }

    @Test (priority = 1)
    @Description("Verify, update existing student")
    public void PutStudent(){
        HashMap<String, String> map = new HashMap<>();
        map.put("id", GenericUtil.getId());
        map.put("studentClass", GenericUtil.getStudentClass());

        MethodUtil.putRes(map, Data.PUT_PARAM,Data.SUCCESSFUL_STATUS_CODE);
    }

    @Test (priority = 2)
    @Description("Verify, fetch student data")
    public void fetchBulkStudent(){
        MethodUtil.fetchRes(Data.FETCH_PARAM,Data.SUCCESSFUL_STATUS_CODE);
    }

    @Test (priority = 3)
    @Description("Verify, fetch all student")
    public void fetchStudentByClass(){
        MethodUtil.fetchRes(Data.FETCH_CLASS_PARAM,Data.SUCCESSFUL_STATUS_CODE);
    }

    @Test (priority = 4)
    @Description("Verify, fetch student based on student id")
    public void fetchStudentByID(){
        MethodUtil.fetchRes(Data.FETCH_ID_PARAM,Data.SUCCESSFUL_STATUS_CODE);
    }

    @Test (priority = 5)
    @Description("Verify, fetch student based on student id and class")
    public void fetchStudentByIDClass(){
        MethodUtil.fetchRes(Data.FETCH_ID_CLASS_PARAM,Data.SUCCESSFUL_STATUS_CODE);
    }

    @Test (priority = 6)
    @Description("Verify, delete existing student")
    public void deleteStudent(){
        HashMap<String, String> map = new HashMap<>();
        map.put("id", GenericUtil.getId());

        MethodUtil.deleteRes(map, Data.DELETE_PARAM,Data.SUCCESSFUL_STATUS_CODE);
    }
}
