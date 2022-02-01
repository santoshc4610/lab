package com.example.lab.LabService;

import com.example.lab.LabRepository.ILabRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LabService implements ILabService{

    @Autowired
    public ILabRepository labRepository;

    @Override
    public int GetKSmallestNum(List<Integer> list1, int k) {
        return labRepository.GetKSmallestNum(list1,k);
    }
}
