package booking.server.adapters;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import booking.server.enums.UserLevel;

public class UserLevelAdapter extends XmlAdapter<Integer, UserLevel> {

	@Override
	public Integer marshal(UserLevel v) throws Exception {
		return v.getId();
	}

	@Override
	public UserLevel unmarshal(Integer v) throws Exception {
		return UserLevel.fromInt(v);
	}

}
