package com.promote.website.mapper;

import static com.promote.website.mapper.MessageDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.promote.website.model.Message;
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
public interface MessageMapper {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.597+08:00", comments = "Source Table: message")
	BasicColumn[] selectList = BasicColumn.columnList(messageId, messages, time);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.596+08:00", comments = "Source Table: message")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	long count(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.597+08:00", comments = "Source Table: message")
	@DeleteProvider(type = SqlProviderAdapter.class, method = "delete")
	int delete(DeleteStatementProvider deleteStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.597+08:00", comments = "Source Table: message")
	@InsertProvider(type = SqlProviderAdapter.class, method = "insert")
	int insert(InsertStatementProvider<Message> insertStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.597+08:00", comments = "Source Table: message")
	@InsertProvider(type = SqlProviderAdapter.class, method = "insertMultiple")
	int insertMultiple(MultiRowInsertStatementProvider<Message> multipleInsertStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.597+08:00", comments = "Source Table: message")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	@ResultMap("MessageResult")
	Optional<Message> selectOne(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.597+08:00", comments = "Source Table: message")
	@SelectProvider(type = SqlProviderAdapter.class, method = "select")
	@Results(id = "MessageResult", value = {
			@Result(column = "message_id", property = "messageId", jdbcType = JdbcType.INTEGER, id = true),
			@Result(column = "messages", property = "messages", jdbcType = JdbcType.VARCHAR),
			@Result(column = "time", property = "time", jdbcType = JdbcType.TIMESTAMP) })
	List<Message> selectMany(SelectStatementProvider selectStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.597+08:00", comments = "Source Table: message")
	@UpdateProvider(type = SqlProviderAdapter.class, method = "update")
	int update(UpdateStatementProvider updateStatement);

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.597+08:00", comments = "Source Table: message")
	default long count(CountDSLCompleter completer) {
		return MyBatis3Utils.countFrom(this::count, message, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.597+08:00", comments = "Source Table: message")
	default int delete(DeleteDSLCompleter completer) {
		return MyBatis3Utils.deleteFrom(this::delete, message, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.597+08:00", comments = "Source Table: message")
	default int deleteByPrimaryKey(Integer messageId_) {
		return delete(c -> c.where(messageId, isEqualTo(messageId_)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.597+08:00", comments = "Source Table: message")
	default int insert(Message record) {
		return MyBatis3Utils.insert(this::insert, record, message, c -> c.map(messageId).toProperty("messageId")
				.map(messages).toProperty("messages").map(time).toProperty("time"));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.597+08:00", comments = "Source Table: message")
	default int insertMultiple(Collection<Message> records) {
		return MyBatis3Utils.insertMultiple(this::insertMultiple, records, message, c -> c.map(messageId)
				.toProperty("messageId").map(messages).toProperty("messages").map(time).toProperty("time"));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.597+08:00", comments = "Source Table: message")
	default int insertSelective(Message record) {
		return MyBatis3Utils.insert(this::insert, record, message,
				c -> c.map(messageId).toPropertyWhenPresent("messageId", record::getMessageId).map(messages)
						.toPropertyWhenPresent("messages", record::getMessages).map(time)
						.toPropertyWhenPresent("time", record::getTime));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.597+08:00", comments = "Source Table: message")
	default Optional<Message> selectOne(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectOne(this::selectOne, selectList, message, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.598+08:00", comments = "Source Table: message")
	default List<Message> select(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectList(this::selectMany, selectList, message, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.598+08:00", comments = "Source Table: message")
	default List<Message> selectDistinct(SelectDSLCompleter completer) {
		return MyBatis3Utils.selectDistinct(this::selectMany, selectList, message, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.598+08:00", comments = "Source Table: message")
	default Optional<Message> selectByPrimaryKey(Integer messageId_) {
		return selectOne(c -> c.where(messageId, isEqualTo(messageId_)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.598+08:00", comments = "Source Table: message")
	default int update(UpdateDSLCompleter completer) {
		return MyBatis3Utils.update(this::update, message, completer);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.598+08:00", comments = "Source Table: message")
	static UpdateDSL<UpdateModel> updateAllColumns(Message record, UpdateDSL<UpdateModel> dsl) {
		return dsl.set(messageId).equalTo(record::getMessageId).set(messages).equalTo(record::getMessages).set(time)
				.equalTo(record::getTime);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.598+08:00", comments = "Source Table: message")
	static UpdateDSL<UpdateModel> updateSelectiveColumns(Message record, UpdateDSL<UpdateModel> dsl) {
		return dsl.set(messageId).equalToWhenPresent(record::getMessageId).set(messages)
				.equalToWhenPresent(record::getMessages).set(time).equalToWhenPresent(record::getTime);
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.598+08:00", comments = "Source Table: message")
	default int updateByPrimaryKey(Message record) {
		return update(c -> c.set(messages).equalTo(record::getMessages).set(time).equalTo(record::getTime)
				.where(messageId, isEqualTo(record::getMessageId)));
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2019-12-17T09:17:09.599+08:00", comments = "Source Table: message")
	default int updateByPrimaryKeySelective(Message record) {
		return update(c -> c.set(messages).equalToWhenPresent(record::getMessages).set(time)
				.equalToWhenPresent(record::getTime).where(messageId, isEqualTo(record::getMessageId)));
	}
}