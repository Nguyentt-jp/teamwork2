package teamwork.dao;

import java.util.List;

import teamwork.model.Categories;
import teamwork.model.Questions;
import teamwork.model.TeamRegister;
import teamwork.model.User;

public interface QuizDao {

	List<TeamRegister> getTeamRegisters();

	List<User> getUser();

	List<Categories> getCategories();

	List<Questions> getData(int id);

	void saveData(Categories categories);

	void saveData(TeamRegister teamRegister);

	void updateData(Questions questions, int id);

	void updateData(TeamRegister teamRegister);

	void deleteData(int id);

}
