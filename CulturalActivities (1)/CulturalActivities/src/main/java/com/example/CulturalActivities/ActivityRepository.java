package com.example.CulturalActivities;

import org.springframework.data.repository.CrudRepository;




public interface ActivityRepository extends CrudRepository<Activity, Integer>{
	
	public void deleteByIdActivite(int idActivite);
	public Activity findByIdActivite(int idActivite);
	public Activity findByNomActivite(String nomActivite);
}
