package com.neuedu.mapper;

import java.util.List;

import com.neuedu.pojo.CheckPack;
import com.neuedu.pojo.HerbalPack;
import com.neuedu.pojo.PrescriptionPack;

public interface ChargedMapper {
	
	List<CheckPack> getCheckappliesByRegistID(Integer registID);
	
	List<PrescriptionPack> getPrescriptionPacksByRegistID(Integer registID);
	
	List<HerbalPack> getHerbalPacksByRegistID(Integer registID);
	
    List<CheckPack> getCheckappliesByID(List<Integer> ID);
	
	List<PrescriptionPack> getPrescriptionPacksByID(List<Integer> ID);
	
	List<HerbalPack> getHerbalPacksByID(List<Integer> ID);
}
