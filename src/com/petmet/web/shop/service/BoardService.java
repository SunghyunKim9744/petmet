package com.petmet.web.shop.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.petmet.web.shop.entity.Board;

public class BoardService {

	public List<Board> getList() {

		String url = "jdbc:oracle:thin:@hi.namoolab.com:1521/xepdb1";
		String sql = "SELECT * FROM S_BOARD";

		List<Board> list = new ArrayList<>();

		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection(url, "petmet", "0000");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);

			while (rs.next()) {
				int id = rs.getInt("ID");
				int category = rs.getInt("CATEGORY");
				String writer = rs.getNString("WRITER");
				String title = rs.getNString("TITLE");
				String content = rs.getString("CONTENT");
				Date regdate = rs.getDate("REGDATE");
				int views = rs.getInt("VIEWS");
				String image = rs.getNString("IMAGE");
				int likes = rs.getInt("LIKES");

				Board b = new Board(id, category, writer, title, content, regdate, views, image, likes);

				list.add(b);
			}

			rs.close();
			st.close();
			con.close();

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		return list;
	}

	public Board get(int id) {

		Board b = null;

		String url = "jdbc:oracle:thin:@hi.namoolab.com:1521/xepdb1";
		String sql = "SELECT * FROM S_BOARD WHERE ID =" + id;
		

		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection(url, "petmet", "0000");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);

			if (rs.next()) {
				int category = rs.getInt("CATEGORY");
				String writer = rs.getNString("WRITER");
				String title = rs.getNString("TITLE");
				String content = rs.getString("CONTENT");
				Date regdate = rs.getDate("REGDATE");
				int views = rs.getInt("VIEWS");
				String image = rs.getNString("IMAGE");
				int likes = rs.getInt("LIKES");
				b = new Board(id, category, writer, title, content, regdate, views, image, likes);
			}

			rs.close();
			st.close();
			con.close();

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		return b;
	}
}