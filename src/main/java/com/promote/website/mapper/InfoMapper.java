package com.promote.website.mapper;

import static com.promote.website.mapper.InfoDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.promote.website.model.Info;
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
public interface InfoMapper {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.595+08:00", comments = "Source Table: info")
	BasicColumn[] selectList = BasicColumn.columnList(infoId, title, infos, time, userId);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.594+08:00", comments = "Source Table: info")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	long count(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.594+08:00", comments = "Source Table: info")
	@DeleteProvider(type = SqlProviderAdapter.class, method = "delete")
	int delete(DeleteStatementProvider deleteStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.594+08:00", comments = "Source Table: info")
	@InsertProvider(type = SqlProviderAdapter.class, method = "insert")
	int insert(InsertStatementProvider<Info> insertStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.594+08:00", comments = "Source Table: info")
	@InsertProvider(type = SqlProviderAdapter.class, method = "insertMultiple")
	int insertMultiple(MultiRowInsertStatementProvider<Info> multipleInsertStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.594+08:00", comments = "Source Table: info")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	@ResultMap("InfoResult")
	Optional<Info> selectOne(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.594+08:00", comments = "Source Table: info")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	@Results(id = "InfoResult", value = {
			@Result(column = "info_id", property = "infoId", jdbcType = JdbcType.INTEGER, id = true),
			@Result(column = "title", property = "title", jdbcType = JdbcType.VARCHAR),
			@Result(column = "infos", property = "infos", jdbcType = JdbcType.VARCHAR),
			@Result(column = "time", property = "time", jdbcType = JdbcType.TIMESTAMP),
			@Result(column = "user_id", property = "userId", jdbcType = JdbcType.INTEGER) })
	List<Info> selectMany(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.594+08:00", comments = "Source Table: info")
	@UpdateProvider(type = SqlProviderAdapter.class, method = "update")
	int update(UpdateStatementProvider updateStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.594+08:00", comments = "Source Table: info")
	default long count(CountDSLCompleter completer) {
		return MyBatis3Utils.countFrom(this::count, info, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.594+08:00", comments = "Source Table: info")
	default int delete(DeleteDSLCompleter completer) {
		return MyBatis3Utils.deleteFrom(this::delete, info, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.594+08:00", comments = "Source Table: info")
	default int deleteByPrimaryKey(Integer infoId_) {
		return delete(c -> c.where(infoId, isEqualTo(infoId_)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.594+08:00", comments = "Source Table: info")
	default int insert(Info record) {
		return MyBatis3Utils.insert(this::insert, record, info,
				c -> c.map(infoId).toProperty("infoId").map(title).toProperty("title").map(infos).toProperty("infos")
						.map(time).toProperty("time").map(userId).toProperty("userId"));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.594+08:00", comments = "Source Table: info")
	default int insertMultiple(Collection<Info> records) {
		return MyBatis3Utils.insertMultiple(this::insertMultiple, records, info,
				c -> c.map(infoId).toProperty("infoId").map(title).toProperty("title").map(infos).toProperty("infos")
						.map(time).toProperty("time").map(userId).toProperty("userId"));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.594+08:00", comments = "Source Table: info")
	default int insertSelective(Info record) {
		return MyBatis3Utils.insert(this::insert, record, info,
				c -> c.map(infoId).toPropertyWhenPresent("infoId", record::getInfoId).map(title)
						.toPropertyWhenPresent("title", record::getTitle).map(infos)
						.toPropertyWhenPresent("infos", record::getInfos).map(time)
						.toPropertyWhenPresent("time", record::getTime).map(userId)
						.toPropertyWhenPresent("userId", record::getUserId));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.595+08:00", comments = "Source Table: info")
	default Optional<Info> selectOne(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectOne(this::selectOne, selectList, info, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.595+08:00", comments = "Source Table: info")
	default List<Info> select(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectList(this::selectMany, selectList, info, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.595+08:00", comments = "Source Table: info")
	default List<Info> selectDistinct(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectDistinct(this::selectMany, selectList, info, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.595+08:00", comments = "Source Table: info")
	default Optional<Info> selectByPrimaryKey(Integer infoId_) {
		return selectOne(c -> c.where(infoId, isEqualTo(infoId_)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.595+08:00", comments = "Source Table: info")
	default int update(UpdateDSLCompleter completer) {
		return MyBatis3Utils.update(this::update, info, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.595+08:00", comments = "Source Table: info")
	static UpdateDSL<UpdateModel> updateAllColumns(Info record, UpdateDSL<UpdateModel> dsl) {
		return dsl.set(infoId).equalTo(record::getInfoId).set(title).equalTo(record::getTitle).set(infos)
				.equalTo(record::getInfos).set(time).equalTo(record::getTime).set(userId).equalTo(record::getUserId);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.595+08:00", comments = "Source Table: info")
	static UpdateDSL<UpdateModel> updateSelectiveColumns(Info record, UpdateDSL<UpdateModel> dsl) {
		return dsl.set(infoId).equalToWhenPresent(record::getInfoId).set(title).equalToWhenPresent(record::getTitle)
				.set(infos).equalToWhenPresent(record::getInfos).set(time).equalToWhenPresent(record::getTime)
				.set(userId).equalToWhenPresent(record::getUserId);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.595+08:00", comments = "Source Table: info")
	default int updateByPrimaryKey(Info record) {
		return update(c -> c.set(title).equalTo(record::getTitle).set(infos).equalTo(record::getInfos).set(time)
				.equalTo(record::getTime).set(userId).equalTo(record::getUserId)
				.where(infoId, isEqualTo(record::getInfoId)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.595+08:00", comments = "Source Table: info")
	default int updateByPrimaryKeySelective(Info record) {
		return update(c -> c.set(title).equalToWhenPresent(record::getTitle).set(infos)
				.equalToWhenPresent(record::getInfos).set(time).equalToWhenPresent(record::getTime).set(userId)
				.equalToWhenPresent(record::getUserId).where(infoId, isEqualTo(record::getInfoId)));
	}
}