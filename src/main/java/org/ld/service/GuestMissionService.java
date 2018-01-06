package org.ld.service;

import java.util.List;
import org.ld.model.Guest;
import org.ld.model.GuestBalance;
import org.ld.model.GuestService;
import org.ld.model.Host;
import org.ld.model.Intern;

public interface GuestMissionService {

	Guest getGuestById(int id);

	List<Guest> getGuestByName(String name, int st, int eachPage);

	Guest getGuestByRoomNumber(String s);

	Guest getGuestByContract(String ct);

	int addGuest(Guest t);

	int addHost(Host t);

	int addIntern(Intern t);

	int addGuestBalance(GuestBalance t);

	int addGuestService(GuestService t);
	
	int delGuest(int id);
	
	int getTotal();
	
	List<Guest> getGuestList(int st, int eachPage);
	
	//add by yck
	int getTotalByName_RoomNumber(String name, String roomNumber);
	List<Guest> getGuestByName_RoomNumber(String name, String roomNumber, int st, int eachPage);
	List<Guest> getAllGuestByName_RoomNumber(String name, String roomNumber);

	//查询为租客gid提供的服务项 (item是要查的条目名)
	GuestService getCertainGuestService(Integer gid, String item);

}