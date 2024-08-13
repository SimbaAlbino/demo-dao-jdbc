package model.dao;

import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {
	public static SellerDao createSellerDao() { //Expõe somente um método que return o tipo da interface
		return new SellerDaoJDBC();// instancia uma implementação
	}
}
