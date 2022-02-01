package com.example.lab.LabController;
import com.example.lab.KLargestElement;
import com.example.lab.LabService.ILabService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class LabController {

    @Autowired
    private ILabService labService;

    @RequestMapping(
            value = "/KsmallNumber",
            produces = {"application/json"},
            consumes = {"application/json"},
            method = RequestMethod.GET)
    //@ResponseBody
    public int GetKSmallestNum()
    {
        String str = new String();
        //List<Integer> arr1 = new ArrayList<Integer>();
       // KLargestElement kl = new KLargestElement(arr1,4);
        //return labService.GetKSmallestNum(kl.getAl(),kl.getK());
        System.out.println(str);
        return 0;
    }

}
