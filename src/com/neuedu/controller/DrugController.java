package com.neuedu.controller;

import java.util.List;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


import javax.annotation.Resource;

import com.neuedu.pojo.Checktemplate;
import com.neuedu.pojo.Drugs;
import com.neuedu.pojo.DrugsDetailedAndDrug;
import com.neuedu.mapper.DrugsMapper;
import com.neuedu.pojo.DrugsExample;
import com.neuedu.pojo.Drugsdetailed;
import com.neuedu.pojo.Drugstemplate;
import com.neuedu.pojo.HerbalTempDetailedAndDrugs;
import com.neuedu.pojo.Herbaldetailed;
import com.neuedu.pojo.Herbaltemplate;
import com.neuedu.pojo.User;
import com.neuedu.service.DrugService;
import com.neuedu.util.ResultDTO;


@Controller
@RequestMapping("/drug")
public class DrugController {
	
	@Autowired
    DrugService drugService;
	
    
	//查询药品 模糊查询
    @ResponseBody
	@RequestMapping("/getdrugsbymnemoniccode")
	public ResultDTO<Drugs> getDrugsByMnemoniccode(@RequestParam(value="mnemoniccode",required=true) String mnemoniccode){
        ResultDTO resultDTO = new ResultDTO();
        try {
            resultDTO.setData(drugService.getDrugsByMnemoniccode(mnemoniccode));
            resultDTO.setStatus("OK");
            resultDTO.setMsg("查询药品成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("查询药品失败！");
        }
        return resultDTO;
	}
	
	//查询药品 根据ID
	@ResponseBody
	@RequestMapping("/getdrugsbyid")
    public ResultDTO<Drugs> getDrugsById(@RequestParam(value="id",required=true)Integer  id){
        ResultDTO resultDTO = new ResultDTO();
        
        try {
            resultDTO.setData(drugService.getDrugsById(id));
            resultDTO.setStatus("OK");
            resultDTO.setMsg("查询药品成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("查询药品失败！");
        }
        return resultDTO;
    }
	
	
	//插入药品
	@ResponseBody
    @RequestMapping("/insert")
    public ResultDTO<Drugs> insert(@RequestBody Drugs drugs){
        ResultDTO resultDTO = new ResultDTO();
        
        try {
            drugService.insertSelective(drugs);
            resultDTO.setData(drugs);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("插入药品成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("插入药品失败！");
        }
        return resultDTO;
    }
    
    //展示所有药品
    @ResponseBody
    @RequestMapping("/getalldrugs")
    public ResultDTO<Drugs> getAllDrugs(){
        ResultDTO resultDTO = new ResultDTO();
        try {
            resultDTO.setData(drugService.getAllDrugs());
            resultDTO.setStatus("OK");
            resultDTO.setMsg("展示药品成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("展示药品失败！");
        }
        return resultDTO;
    }
    
    //更新药品
    @ResponseBody
    @RequestMapping("/update")
    public ResultDTO<Drugs> update(@RequestBody Drugs drugs){
        ResultDTO resultDTO = new ResultDTO();
        try {
            drugService.update(drugs);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("更新药品成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("更新药品失败！");
        }
        return resultDTO;
    }
    
    //删除药品 在数据库不删除
    @ResponseBody
    @RequestMapping("/delete")
    public ResultDTO<Drugs> delete(@RequestParam(value="id",required=true)Integer id){
        ResultDTO resultDTO = new ResultDTO();
        try {
            drugService.deleteById(id);
            resultDTO.setStatus("OK");
            resultDTO.setMsg("删除药品成功！");
        } catch (Exception e) {
            e.printStackTrace();
            resultDTO.setStatus("ERROR");
            resultDTO.setMsg("删除药品失败！");
        }
        return resultDTO;
    }
    

    //获得成药处方模板
	@RequestMapping("getdrugstemplates")
	public @ResponseBody ResultDTO<List<Drugstemplate>> getDrugstemplate() {
		ResultDTO<List<Drugstemplate>> resultDTO=new ResultDTO<>();
		try {  
			Session session = SecurityUtils.getSubject().getSession(); 
			User user=(User)session.getAttribute("user");
			resultDTO.setData(drugService.getDrugstemplate(user));
			resultDTO.setStatus("OK");
			resultDTO.setMsg("获取成功！");
		} catch (Exception e) {
			e.printStackTrace();
			resultDTO.setStatus("ERROR");
			resultDTO.setMsg("获取失败！");
		}
		return resultDTO;
	}
	
	//获得草药处方模板
	@RequestMapping("getherbaltemplate")
	public @ResponseBody ResultDTO<List<Herbaltemplate>> getHerbaltemplate() {
		ResultDTO<List<Herbaltemplate>> resultDTO=new ResultDTO<>();
		try {  
			Session session = SecurityUtils.getSubject().getSession(); 
			User user=(User)session.getAttribute("user");
			resultDTO.setData(drugService.getHerbaltemplate(user));
			resultDTO.setStatus("OK");
			resultDTO.setMsg("获取成功！");
		} catch (Exception e) {
			e.printStackTrace();
			resultDTO.setStatus("ERROR");
			resultDTO.setMsg("获取失败！");
		}
		return resultDTO;
	}
	
	//获得成药模板明细
	@RequestMapping("getdrugsdetailedanddrug")
	public @ResponseBody ResultDTO<List<DrugsDetailedAndDrug>> getDrugsDetailedAndDrug(int drugsTempID) {
		ResultDTO<List<DrugsDetailedAndDrug>> resultDTO=new ResultDTO<>();
		try {  
			resultDTO.setData(drugService.getDrugsDetailedAndDrug(drugsTempID));
			resultDTO.setStatus("OK");
			resultDTO.setMsg("获取成功！");
		} catch (Exception e) {
			e.printStackTrace();
			resultDTO.setStatus("ERROR");
			resultDTO.setMsg("获取失败！");
		}
		return resultDTO;
	}
	
	//获得成药模板明细
	@RequestMapping("getherbaltempdetailedanddrug")
	public @ResponseBody ResultDTO<List<HerbalTempDetailedAndDrugs>> getHerbalTempDetailedAndDrug(int herbalTempID) {
		ResultDTO<List<HerbalTempDetailedAndDrugs>> resultDTO=new ResultDTO<>();
		try {  
			resultDTO.setData(drugService.getHerbalTempDetailedAndDrug(herbalTempID));
			resultDTO.setStatus("OK");
			resultDTO.setMsg("获取成功！");
		} catch (Exception e) {
			e.printStackTrace();
			resultDTO.setStatus("ERROR");
			resultDTO.setMsg("获取失败！");
		}
		return resultDTO;
	}
	
	//获得特定条件的药品
	@RequestMapping("getdrugsonconditions")
	public @ResponseBody ResultDTO<List<Drugs>> getDrugsOnConditions(@RequestBody Drugs drugs) {
		ResultDTO<List<Drugs>> resultDTO=new ResultDTO<>();
		try {  
			resultDTO.setData(drugService.getDrugsOnConditions(drugs));
			resultDTO.setStatus("OK");
			resultDTO.setMsg("获取成功！");
		} catch (Exception e) {
			e.printStackTrace();
			resultDTO.setStatus("ERROR");
			resultDTO.setMsg("获取失败！");
		}
		return resultDTO;
	}
	
	//插入成药处方模板
	@RequestMapping("insertdrugstemplate")
	public @ResponseBody ResultDTO<Integer> insertDrugstemplate(@RequestBody Drugstemplate drugstemplate) {
		ResultDTO<Integer> resultDTO=new ResultDTO<>();
		try {  
			drugService.insertDrugstemplate(drugstemplate);
			resultDTO.setStatus("OK");
			resultDTO.setMsg("插入成功！");
		} catch (Exception e) {
			e.printStackTrace();
			resultDTO.setStatus("ERROR");
			resultDTO.setMsg("插入失败！");
		}
		return resultDTO;
	}

	//更新成药处方模板
	@RequestMapping("updatedrugstemplate")
	public @ResponseBody ResultDTO<Integer> updateDrugstemplate(@RequestBody Drugstemplate drugstemplate) {
		ResultDTO<Integer> resultDTO=new ResultDTO<>();
		try {  
			drugService.updateDrugstemplate(drugstemplate);
			resultDTO.setStatus("OK");
			resultDTO.setMsg("更新成功！");
		} catch (Exception e) {
			e.printStackTrace();
			resultDTO.setStatus("ERROR");
			resultDTO.setMsg("更新失败！");
		}
		return resultDTO;
	}
	//删除成药处方模板
	@RequestMapping("deletedrugstemplate")
	public @ResponseBody ResultDTO<Integer> deleteDrugstemplate(int id) {
		ResultDTO<Integer> resultDTO=new ResultDTO<>();
		try {  
			drugService.deleteDrugstemplate(id);
			resultDTO.setStatus("OK");
			resultDTO.setMsg("删除成功！");
		} catch (Exception e) {
			e.printStackTrace();
			resultDTO.setStatus("ERROR");
			resultDTO.setMsg("删除失败！");
		}
		return resultDTO;
	}	
	
	
	//插入草药处方模板
	@RequestMapping("insertherbaltemplate")
	public @ResponseBody ResultDTO<Integer> insertHerbaltemplate(@RequestBody Herbaltemplate herbaltemplate) {
		ResultDTO<Integer> resultDTO=new ResultDTO<>();
		try {  
			drugService.insertHerbaltemplate(herbaltemplate);
			resultDTO.setStatus("OK");
			resultDTO.setMsg("插入成功！");
		} catch (Exception e) {
			e.printStackTrace();
			resultDTO.setStatus("ERROR");
			resultDTO.setMsg("插入失败！");
		}
		return resultDTO;
	}

	//更新草药处方模板
	@RequestMapping("updateherbaltemplate")
	public @ResponseBody ResultDTO<Integer> updateHerbaltemplate(@RequestBody Herbaltemplate herbaltemplate) {
		ResultDTO<Integer> resultDTO=new ResultDTO<>();
		try {  
			drugService.updateHerbaltemplate(herbaltemplate);
			resultDTO.setStatus("OK");
			resultDTO.setMsg("更新成功！");
		} catch (Exception e) {
			e.printStackTrace();
			resultDTO.setStatus("ERROR");
			resultDTO.setMsg("更新失败！");
		}
		return resultDTO;
	}
	//删除草药处方模板
	@RequestMapping("deleteherbaltemplate")
	public @ResponseBody ResultDTO<Integer> deleteHerbaltemplate(int id) {
		ResultDTO<Integer> resultDTO=new ResultDTO<>();
		try {  
			drugService.deleteHerbaltemplate(id);
			resultDTO.setStatus("OK");
			resultDTO.setMsg("删除成功！");
		} catch (Exception e) {
			e.printStackTrace();
			resultDTO.setStatus("ERROR");
			resultDTO.setMsg("删除失败！");
		}
		return resultDTO;
	}		

	//插入成药模板明细
	@RequestMapping("insertdrugsdetailed")
	public @ResponseBody ResultDTO<Integer> insertDrugsDetailed(@RequestBody List<Drugsdetailed> drugsdetaileds) {
		ResultDTO<Integer> resultDTO=new ResultDTO<>();
		try {  
			drugService.insertDrugsDetailed(drugsdetaileds);
			resultDTO.setStatus("OK");
			resultDTO.setMsg("插入成功！");
		} catch (Exception e) {
			e.printStackTrace();
			resultDTO.setStatus("ERROR");
			resultDTO.setMsg("插入失败！");
		}
		return resultDTO;
	}	
	
	
	//删除成药模板明细
	@RequestMapping("deletedrugsdetailed")
	public @ResponseBody ResultDTO<Integer> deleteDrugsDetailed(@RequestBody List<Integer> ids) {
		ResultDTO<Integer> resultDTO=new ResultDTO<>();
		try {  
			drugService.deleteDrugsDetailed(ids);
			resultDTO.setStatus("OK");
			resultDTO.setMsg("删除成功！");
		} catch (Exception e) {
			e.printStackTrace();
			resultDTO.setStatus("ERROR");
			resultDTO.setMsg("删除失败！");
		}
		return resultDTO;
	}	
	
	//插入草药模板明细
	@RequestMapping("insertherbaldetailed")
	public @ResponseBody ResultDTO<Integer> insertHerbalDetailed(@RequestBody  List<Herbaldetailed> herbaldetaileds) {
		ResultDTO<Integer> resultDTO=new ResultDTO<>();
		try {  
			drugService.insertHerbalDetailed(herbaldetaileds);
			resultDTO.setStatus("OK");
			resultDTO.setMsg("插入成功！");
		} catch (Exception e) {
			e.printStackTrace();
			resultDTO.setStatus("ERROR");
			resultDTO.setMsg("插入失败！");
		}
		return resultDTO;
	}	
	
	
	//删除草药模板明细
	@RequestMapping("deleteherbaldetailed")
	public @ResponseBody ResultDTO<Integer> deleteHerbalDetailed(@RequestBody List<Integer> ids)  {
		ResultDTO<Integer> resultDTO=new ResultDTO<>();
		try {  
			drugService.deleteHerbalDetailed(ids);
			resultDTO.setStatus("OK");
			resultDTO.setMsg("删除成功！");
		} catch (Exception e) {
			e.printStackTrace();
			resultDTO.setStatus("ERROR");
			resultDTO.setMsg("删除失败！");
		}
		return resultDTO;
	}
}
