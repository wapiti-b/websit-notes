package com.promote.website.mapper;

import static com.promote.website.mapper.CollectDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.promote.website.model.Collect;
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
public interface CollectMapper {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.614+08:00", comments = "Source Table: collect")
	BasicColumn[] selectList = BasicColumn.columnList(collectId, userId, infoId);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.599+08:00", comments = "Source Table: collect")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	long count(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.599+08:00", comments = "Source Table: collect")
	@DeleteProvider(type = SqlProviderAdapter.class, method = "delete")
	int delete(DeleteStatementProvider deleteStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.599+08:00", comments = "Source Table: collect")
	@InsertProvider(type = SqlProviderAdapter.class, method = "insert")
	int insert(InsertStatementProvider<Collect> insertStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.599+08:00", comments = "Source Table: collect")
	@InsertProvider(type = SqlProviderAdapter.class, method = "insertMultiple")
	int insertMultiple(MultiRowInsertStatementProvider<Collect> multipleInsertStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.612+08:00", comments = "Source Table: collect")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	@ResultMap("CollectResult")
	Optional<Collect> selectOne(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.613+08:00", comments = "Source Table: collect")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	@Results(id = "CollectResult", value = {
			@Result(column = "collect_id", property = "collectId", jdbcType = JdbcType.INTEGER, id = true),
			@Result(column = "user_id", property = "userId", jdbcType = JdbcType.INTEGER),
			@Result(column = "info_id", property = "infoId", jdbcType = JdbcType.INTEGER) })
	List<Collect> selectMany(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.613+08:00", comments = "Source Table: collect")
	@UpdateProvider(type = SqlProviderAdapter.class, method = "update")
	int update(UpdateStatementProvider updateStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.613+08:00", comments = "Source Table: collect")
	default long count(CountDSLCompleter completer) {
		return MyBatis3Utils.countFrom(this::count, collect, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.613+08:00", comments = "Source Table: collect")
	default int delete(DeleteDSLCompleter completer) {
		return MyBatis3Utils.deleteFrom(this::delete, collect, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.613+08:00", comments = "Source Table: collect")
	default int deleteByPrimaryKey(Integer collectId_) {
		return delete(c -> c.where(collectId, isEqualTo(collectId_)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.613+08:00", comments = "Source Table: collect")
	default int insert(Collect record) {
		return MyBatis3Utils.insert(this::insert, record, collect, c -> c.map(collectId).toProperty("collectId")
				.map(userId).toProperty("userId").map(infoId).toProperty("infoId"));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.613+08:00", comments = "Source Table: collect")
	default int insertMultiple(Collection<Collect> records) {
		return MyBatis3Utils.insertMultiple(this::insertMultiple, records, collect, c -> c.map(collectId)
				.toProperty("collectId").map(userId).toProperty("userId").map(infoId).toProperty("infoId"));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.614+08:00", comments = "Source Table: collect")
	default int insertSelective(Collect record) {
		return MyBatis3Utils.insert(this::insert, record, collect,
				c -> c.map(collectId).toPropertyWhenPresent("collectId", record::getCollectId).map(userId)
						.toPropertyWhenPresent("userId", record::getUserId).map(infoId)
						.toPropertyWhenPresent("infoId", record::getInfoId));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.614+08:00", comments = "Source Table: collect")
	default Optional<Collect> selectOne(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectOne(this::selectOne, selectList, collect, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.614+08:00", comments = "Source Table: collect")
	default List<Collect> select(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectList(this::selectMany, selectList, collect, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.614+08:00", comments = "Source Table: collect")
	default List<Collect> selectDistinct(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectDistinct(this::selectMany, selectList, collect, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.614+08:00", comments = "Source Table: collect")
	default Optional<Collect> selectByPrimaryKey(Integer collectId_) {
		return selectOne(c -> c.where(collectId, isEqualTo(collectId_)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.614+08:00", comments = "Source Table: collect")
	default int update(UpdateDSLCompleter completer) {
		return MyBatis3Utils.update(this::update, collect, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.614+08:00", comments = "Source Table: collect")
	static UpdateDSL<UpdateModel> updateAllColumns(Collect record, UpdateDSL<UpdateModel> dsl) {
		return dsl.set(collectId).equalTo(record::getCollectId).set(userId).equalTo(record::getUserId).set(infoId)
				.equalTo(record::getInfoId);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.614+08:00", comments = "Source Table: collect")
	static UpdateDSL<UpdateModel> updateSelectiveColumns(Collect record, UpdateDSL<UpdateModel> dsl) {
		return dsl.set(collectId).equalToWhenPresent(record::getCollectId).set(userId)
				.equalToWhenPresent(record::getUserId).set(infoId).equalToWhenPresent(record::getInfoId);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.614+08:00", comments = "Source Table: collect")
	default int updateByPrimaryKey(Collect record) {
		return update(c -> c.set(userId).equalTo(record::getUserId).set(infoId).equalTo(record::getInfoId)
				.where(collectId, isEqualTo(record::getCollectId)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.615+08:00", comments = "Source Table: collect")
	default int updateByPrimaryKeySelective(Collect record) {
		return update(c -> c.set(userId).equalToWhenPresent(record::getUserId).set(infoId)
				.equalToWhenPresent(record::getInfoId).where(collectId, isEqualTo(record::getCollectId)));
	}
}