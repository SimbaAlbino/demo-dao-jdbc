package model.dao;

import db.DB;
import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {
	public static SellerDao createSellerDao() { //Expõe somente um método que return o tipo da interface
		return new SellerDaoJDBC(DB.getConnection());// instancia uma implementação
	}
}
