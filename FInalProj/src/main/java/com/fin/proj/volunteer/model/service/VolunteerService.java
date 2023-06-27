package com.fin.proj.volunteer.model.service;

import java.util.ArrayList;
import java.util.HashMap;

import com.fin.proj.common.model.vo.PageInfo;
import com.fin.proj.volunteer.model.vo.Volunteer;

public interface VolunteerService {

	int insertVolunteer(Volunteer v);

	int getVolunteerCount();

	ArrayList<Volunteer> selectVolunteerList(PageInfo pi);

	Volunteer selectVolunteer(int vNo);

	int updateVolunteer(Volunteer v);

	int deleteVolunteer(String vNo);

	int applyVolunteer(Volunteer v);

	int checkVolunteerApply(HashMap<String, Integer> map);

	int getSearchVolunteerCount(HashMap<String, String> map);

	ArrayList<Volunteer> searchVolunteer(PageInfo pi, HashMap<String, String> map);

	ArrayList<Volunteer> searchVolunteerByAjax(PageInfo pi, HashMap<String, String> ajaxMap);

	int getVolunteerEnrollHistoryCount(int uNo);

	ArrayList<Volunteer> selectVolunteerEnrollHistory(PageInfo pi, int uNo);
}
