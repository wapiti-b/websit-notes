package com.promote.website.mapper;

import static com.promote.website.mapper.UserDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.promote.website.model.User;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.dynamic.sql.BasicColumn;
import org.mybatis.dynamic.sql.delete.DeleteDSLCompleter;
import org.mybatis.dynamic.sql.delete.render.DeleteStatementProvider;
import org.mybatis.dynamic.sql.insert.render.InsertStatementProvider;
import org.mybatis.dynamic.sql.insert.render.MultiRowInsertStatementProvider;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.UpdateDSL;
import org.mybatis.dynamic.sql.update.UpdateDSLCompleter;
import org.mybatis.dynamic.sql.update.UpdateModel;
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;
import org.mybatis.dynamic.sql.util.mybatis3.MyBatis3Utils;

@Mapper
public interface UserMapper {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.585+08:00", comments = "Source Table: user")
	BasicColumn[] selectList = BasicColumn.columnList(userId, username, password, emil, img, lasttime, authority);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.576+08:00", comments = "Source Table: user")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	long count(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.577+08:00", comments = "Source Table: user")
	@DeleteProvider(type = SqlProviderAdapter.class, method = "delete")
	int delete(DeleteStatementProvider deleteStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.578+08:00", comments = "Source Table: user")
	@InsertProvider(type = SqlProviderAdapter.class, method = "insert")
	int insert(InsertStatementProvider<User> insertStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.578+08:00", comments = "Source Table: user")
	@InsertProvider(type = SqlProviderAdapter.class, method = "insertMultiple")
	int insertMultiple(MultiRowInsertStatementProvider<User> multipleInsertStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.579+08:00", comments = "Source Table: user")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	@ResultMap("UserResult")
	Optional<User> selectOne(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.579+08:00", comments = "Source Table: user")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	@Results(id = "UserResult", value = {
			@Result(column = "user_id", property = "userId", jdbcType = JdbcType.INTEGER, id = true),
			@Result(column = "username", property = "username", jdbcType = JdbcType.VARCHAR),
			@Result(column = "password", property = "password", jdbcType = JdbcType.VARCHAR),
			@Result(column = "emil", property = "emil", jdbcType = JdbcType.VARCHAR),
			@Result(column = "img", property = "img", jdbcType = JdbcType.VARCHAR),
			@Result(column = "lasttime", property = "lasttime", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "authority", property = "authority", jdbcType = JdbcType.INTEGER) })
	List<User> selectMany(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.581+08:00", comments = "Source Table: user")
	@UpdateProvider(type = SqlProviderAdapter.class, method = "update")
	int update(UpdateStatementProvider updateStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.582+08:00", comments = "Source Table: user")
	default long count(CountDSLCompleter completer) {
		return MyBatis3Utils.countFrom(this::count, user, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.582+08:00", comments = "Source Table: user")
	default int delete(DeleteDSLCompleter completer) {
		return MyBatis3Utils.deleteFrom(this::delete, user, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.582+08:00", comments = "Source Table: user")
	default int deleteByPrimaryKey(Integer userId_) {
		return delete(c -> c.where(userId, isEqualTo(userId_)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.582+08:00", comments = "Source Table: user")
	default int insert(User record) {
		return MyBatis3Utils.insert(this::insert, record, user,
				c -> c.map(userId).toProperty("userId").map(username).toProperty("username").map(password)
						.toProperty("password").map(emil).toProperty("emil").map(img).toProperty("img").map(lasttime)
						.toProperty("lasttime").map(authority).toProperty("authority"));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.584+08:00", comments = "Source Table: user")
	default int insertMultiple(Collection<User> records) {
		return MyBatis3Utils.insertMultiple(this::insertMultiple, records, user,
				c -> c.map(userId).toProperty("userId").map(username).toProperty("username").map(password)
						.toProperty("password").map(emil).toProperty("emil").map(img).toProperty("img").map(lasttime)
						.toProperty("lasttime").map(authority).toProperty("authority"));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.584+08:00", comments = "Source Table: user")
	default int insertSelective(User record) {
		return MyBatis3Utils.insert(this::insert, record, user,
				c -> c.map(userId).toPropertyWhenPresent("userId", record::getUserId).map(username)
						.toPropertyWhenPresent("username", record::getUsername).map(password)
						.toPropertyWhenPresent("password", record::getPassword).map(emil)
						.toPropertyWhenPresent("emil", record::getEmil).map(img)
						.toPropertyWhenPresent("img", record::getImg).map(lasttime)
						.toPropertyWhenPresent("lasttime", record::getLasttime).map(authority)
						.toPropertyWhenPresent("authority", record::getAuthority));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.586+08:00", comments = "Source Table: user")
	default Optional<User> selectOne(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectOne(this::selectOne, selectList, user, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.587+08:00", comments = "Source Table: user")
	default List<User> select(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectList(this::selectMany, selectList, user, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.587+08:00", comments = "Source Table: user")
	default List<User> selectDistinct(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectDistinct(this::selectMany, selectList, user, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.588+08:00", comments = "Source Table: user")
	default Optional<User> selectByPrimaryKey(Integer userId_) {
		return selectOne(c -> c.where(userId, isEqualTo(userId_)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.588+08:00", comments = "Source Table: user")
	default int update(UpdateDSLCompleter completer) {
		return MyBatis3Utils.update(this::update, user, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.588+08:00", comments = "Source Table: user")
	static UpdateDSL<UpdateModel> updateAllColumns(User record, UpdateDSL<UpdateModel> dsl) {
		return dsl.set(userId).equalTo(record::getUserId).set(username).equalTo(record::getUsername).set(password)
				.equalTo(record::getPassword).set(emil).equalTo(record::getEmil).set(img).equalTo(record::getImg)
				.set(lasttime).equalTo(record::getLasttime).set(authority).equalTo(record::getAuthority);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.589+08:00", comments = "Source Table: user")
	static UpdateDSL<UpdateModel> updateSelectiveColumns(User record, UpdateDSL<UpdateModel> dsl) {
		return dsl.set(userId).equalToWhenPresent(record::getUserId).set(username)
				.equalToWhenPresent(record::getUsername).set(password).equalToWhenPresent(record::getPassword).set(emil)
				.equalToWhenPresent(record::getEmil).set(img).equalToWhenPresent(record::getImg).set(lasttime)
				.equalToWhenPresent(record::getLasttime).set(authority).equalToWhenPresent(record::getAuthority);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.59+08:00", comments = "Source Table: user")
	default int updateByPrimaryKey(User record) {
		return update(c -> c.set(username).equalTo(record::getUsername).set(password).equalTo(record::getPassword)
				.set(emil).equalTo(record::getEmil).set(img).equalTo(record::getImg).set(lasttime)
				.equalTo(record::getLasttime).set(authority).equalTo(record::getAuthority)
				.where(userId, isEqualTo(record::getUserId)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.59+08:00", comments = "Source Table: user")
	default int updateByPrimaryKeySelective(User record) {
		return update(c -> c.set(username).equalToWhenPresent(record::getUsername).set(password)
				.equalToWhenPresent(record::getPassword).set(emil).equalToWhenPresent(record::getEmil).set(img)
				.equalToWhenPresent(record::getImg).set(lasttime).equalToWhenPresent(record::getLasttime).set(authority)
				.equalToWhenPresent(record::getAuthority).where(userId, isEqualTo(record::getUserId)));
	}
}