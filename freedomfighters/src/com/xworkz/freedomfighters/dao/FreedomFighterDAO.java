package com.xworkz.freedomfighters.dao;

import java.util.List;

import com.xworkz.freedomfighters.entity.FreedomFightersEntity;

public interface FreedomFighterDAO {
	
	boolean save(List<FreedomFightersEntity> entities);

}
