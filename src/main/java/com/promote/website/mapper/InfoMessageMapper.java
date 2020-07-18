package com.promote.website.mapper;

import static com.promote.website.mapper.InfoMessageDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.promote.website.model.InfoMessage;
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
public interface InfoMessageMapper {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.617+08:00", comments = "Source Table: info_message")
	BasicColumn[] selectList = BasicColumn.columnList(infoMessageId, infoId, messageId);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.616+08:00", comments = "Source Table: info_message")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	long count(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.616+08:00", comments = "Source Table: info_message")
	@DeleteProvider(type = SqlProviderAdapter.class, method = "delete")
	int delete(DeleteStatementProvider deleteStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.616+08:00", comments = "Source Table: info_message")
	@InsertProvider(type = SqlProviderAdapter.class, method = "insert")
	int insert(InsertStatementProvider<InfoMessage> insertStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.616+08:00", comments = "Source Table: info_message")
	@InsertProvider(type = SqlProviderAdapter.class, method = "insertMultiple")
	int insertMultiple(MultiRowInsertStatementProvider<InfoMessage> multipleInsertStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.616+08:00", comments = "Source Table: info_message")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	@ResultMap("InfoMessageResult")
	Optional<InfoMessage> selectOne(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.616+08:00", comments = "Source Table: info_message")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	@Results(id = "InfoMessageResult", value = {
			@Result(column = "info_message_id", property = "infoMessageId", jdbcType = JdbcType.INTEGER, id = true),
			@Result(column = "info_id", property = "infoId", jdbcType = JdbcType.INTEGER),
			@Result(column = "message_id", property = "messageId", jdbcType = JdbcType.INTEGER) })
	List<InfoMessage> selectMany(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.616+08:00", comments = "Source Table: info_message")
	@UpdateProvider(type = SqlProviderAdapter.class, method = "update")
	int update(UpdateStatementProvider updateStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.616+08:00", comments = "Source Table: info_message")
	default long count(CountDSLCompleter completer) {
		return MyBatis3Utils.countFrom(this::count, infoMessage, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.616+08:00", comments = "Source Table: info_message")
	default int delete(DeleteDSLCompleter completer) {
		return MyBatis3Utils.deleteFrom(this::delete, infoMessage, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.616+08:00", comments = "Source Table: info_message")
	default int deleteByPrimaryKey(Integer infoMessageId_) {
		return delete(c -> c.where(infoMessageId, isEqualTo(infoMessageId_)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.617+08:00", comments = "Source Table: info_message")
	default int insert(InfoMessage record) {
		return MyBatis3Utils.insert(this::insert, record, infoMessage, c -> c.map(infoMessageId)
				.toProperty("infoMessageId").map(infoId).toProperty("infoId").map(messageId).toProperty("messageId"));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.617+08:00", comments = "Source Table: info_message")
	default int insertMultiple(Collection<InfoMessage> records) {
		return MyBatis3Utils.insertMultiple(this::insertMultiple, records, infoMessage, c -> c.map(infoMessageId)
				.toProperty("infoMessageId").map(infoId).toProperty("infoId").map(messageId).toProperty("messageId"));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.617+08:00", comments = "Source Table: info_message")
	default int insertSelective(InfoMessage record) {
		return MyBatis3Utils.insert(this::insert, record, infoMessage,
				c -> c.map(infoMessageId).toPropertyWhenPresent("infoMessageId", record::getInfoMessageId).map(infoId)
						.toPropertyWhenPresent("infoId", record::getInfoId).map(messageId)
						.toPropertyWhenPresent("messageId", record::getMessageId));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.617+08:00", comments = "Source Table: info_message")
	default Optional<InfoMessage> selectOne(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectOne(this::selectOne, selectList, infoMessage, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.617+08:00", comments = "Source Table: info_message")
	default List<InfoMessage> select(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectList(this::selectMany, selectList, infoMessage, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.617+08:00", comments = "Source Table: info_message")
	default List<InfoMessage> selectDistinct(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectDistinct(this::selectMany, selectList, infoMessage, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.617+08:00", comments = "Source Table: info_message")
	default Optional<InfoMessage> selectByPrimaryKey(Integer infoMessageId_) {
		return selectOne(c -> c.where(infoMessageId, isEqualTo(infoMessageId_)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.617+08:00", comments = "Source Table: info_message")
	default int update(UpdateDSLCompleter completer) {
		return MyBatis3Utils.update(this::update, infoMessage, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.617+08:00", comments = "Source Table: info_message")
	static UpdateDSL<UpdateModel> updateAllColumns(InfoMessage record, UpdateDSL<UpdateModel> dsl) {
		return dsl.set(infoMessageId).equalTo(record::getInfoMessageId).set(infoId).equalTo(record::getInfoId)
				.set(messageId).equalTo(record::getMessageId);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.617+08:00", comments = "Source Table: info_message")
	static UpdateDSL<UpdateModel> updateSelectiveColumns(InfoMessage record, UpdateDSL<UpdateModel> dsl) {
		return dsl.set(infoMessageId).equalToWhenPresent(record::getInfoMessageId).set(infoId)
				.equalToWhenPresent(record::getInfoId).set(messageId).equalToWhenPresent(record::getMessageId);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.618+08:00", comments = "Source Table: info_message")
	default int updateByPrimaryKey(InfoMessage record) {
		return update(c -> c.set(infoId).equalTo(record::getInfoId).set(messageId).equalTo(record::getMessageId)
				.where(infoMessageId, isEqualTo(record::getInfoMessageId)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.618+08:00", comments = "Source Table: info_message")
	default int updateByPrimaryKeySelective(InfoMessage record) {
		return update(c -> c.set(infoId).equalToWhenPresent(record::getInfoId).set(messageId)
				.equalToWhenPresent(record::getMessageId).where(infoMessageId, isEqualTo(record::getInfoMessageId)));
	}
}