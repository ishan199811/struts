package domain;

import java.util.List;



public interface Heelodao {
	public void saveOrUpdate(Hello hello);
	public List<Hello> listUser();
	public Hello listUserById(Long helloId);
	public void deleteUser(Long helloId);

}
