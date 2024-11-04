package com.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WxpayV3TransferDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WxpayV3TransferDetailExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andOutBatchNoIsNull() {
            addCriterion("OUT_BATCH_NO is null");
            return (Criteria) this;
        }

        public Criteria andOutBatchNoIsNotNull() {
            addCriterion("OUT_BATCH_NO is not null");
            return (Criteria) this;
        }

        public Criteria andOutBatchNoEqualTo(String value) {
            addCriterion("OUT_BATCH_NO =", value, "outBatchNo");
            return (Criteria) this;
        }

        public Criteria andOutBatchNoNotEqualTo(String value) {
            addCriterion("OUT_BATCH_NO <>", value, "outBatchNo");
            return (Criteria) this;
        }

        public Criteria andOutBatchNoGreaterThan(String value) {
            addCriterion("OUT_BATCH_NO >", value, "outBatchNo");
            return (Criteria) this;
        }

        public Criteria andOutBatchNoGreaterThanOrEqualTo(String value) {
            addCriterion("OUT_BATCH_NO >=", value, "outBatchNo");
            return (Criteria) this;
        }

        public Criteria andOutBatchNoLessThan(String value) {
            addCriterion("OUT_BATCH_NO <", value, "outBatchNo");
            return (Criteria) this;
        }

        public Criteria andOutBatchNoLessThanOrEqualTo(String value) {
            addCriterion("OUT_BATCH_NO <=", value, "outBatchNo");
            return (Criteria) this;
        }

        public Criteria andOutBatchNoLike(String value) {
            addCriterion("OUT_BATCH_NO like", value, "outBatchNo");
            return (Criteria) this;
        }

        public Criteria andOutBatchNoNotLike(String value) {
            addCriterion("OUT_BATCH_NO not like", value, "outBatchNo");
            return (Criteria) this;
        }

        public Criteria andOutBatchNoIn(List<String> values) {
            addCriterion("OUT_BATCH_NO in", values, "outBatchNo");
            return (Criteria) this;
        }

        public Criteria andOutBatchNoNotIn(List<String> values) {
            addCriterion("OUT_BATCH_NO not in", values, "outBatchNo");
            return (Criteria) this;
        }

        public Criteria andOutBatchNoBetween(String value1, String value2) {
            addCriterion("OUT_BATCH_NO between", value1, value2, "outBatchNo");
            return (Criteria) this;
        }

        public Criteria andOutBatchNoNotBetween(String value1, String value2) {
            addCriterion("OUT_BATCH_NO not between", value1, value2, "outBatchNo");
            return (Criteria) this;
        }

        public Criteria andOutDetailNoIsNull() {
            addCriterion("OUT_DETAIL_NO is null");
            return (Criteria) this;
        }

        public Criteria andOutDetailNoIsNotNull() {
            addCriterion("OUT_DETAIL_NO is not null");
            return (Criteria) this;
        }

        public Criteria andOutDetailNoEqualTo(String value) {
            addCriterion("OUT_DETAIL_NO =", value, "outDetailNo");
            return (Criteria) this;
        }

        public Criteria andOutDetailNoNotEqualTo(String value) {
            addCriterion("OUT_DETAIL_NO <>", value, "outDetailNo");
            return (Criteria) this;
        }

        public Criteria andOutDetailNoGreaterThan(String value) {
            addCriterion("OUT_DETAIL_NO >", value, "outDetailNo");
            return (Criteria) this;
        }

        public Criteria andOutDetailNoGreaterThanOrEqualTo(String value) {
            addCriterion("OUT_DETAIL_NO >=", value, "outDetailNo");
            return (Criteria) this;
        }

        public Criteria andOutDetailNoLessThan(String value) {
            addCriterion("OUT_DETAIL_NO <", value, "outDetailNo");
            return (Criteria) this;
        }

        public Criteria andOutDetailNoLessThanOrEqualTo(String value) {
            addCriterion("OUT_DETAIL_NO <=", value, "outDetailNo");
            return (Criteria) this;
        }

        public Criteria andOutDetailNoLike(String value) {
            addCriterion("OUT_DETAIL_NO like", value, "outDetailNo");
            return (Criteria) this;
        }

        public Criteria andOutDetailNoNotLike(String value) {
            addCriterion("OUT_DETAIL_NO not like", value, "outDetailNo");
            return (Criteria) this;
        }

        public Criteria andOutDetailNoIn(List<String> values) {
            addCriterion("OUT_DETAIL_NO in", values, "outDetailNo");
            return (Criteria) this;
        }

        public Criteria andOutDetailNoNotIn(List<String> values) {
            addCriterion("OUT_DETAIL_NO not in", values, "outDetailNo");
            return (Criteria) this;
        }

        public Criteria andOutDetailNoBetween(String value1, String value2) {
            addCriterion("OUT_DETAIL_NO between", value1, value2, "outDetailNo");
            return (Criteria) this;
        }

        public Criteria andOutDetailNoNotBetween(String value1, String value2) {
            addCriterion("OUT_DETAIL_NO not between", value1, value2, "outDetailNo");
            return (Criteria) this;
        }

        public Criteria andTransferAmountIsNull() {
            addCriterion("TRANSFER_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andTransferAmountIsNotNull() {
            addCriterion("TRANSFER_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andTransferAmountEqualTo(BigDecimal value) {
            addCriterion("TRANSFER_AMOUNT =", value, "transferAmount");
            return (Criteria) this;
        }

        public Criteria andTransferAmountNotEqualTo(BigDecimal value) {
            addCriterion("TRANSFER_AMOUNT <>", value, "transferAmount");
            return (Criteria) this;
        }

        public Criteria andTransferAmountGreaterThan(BigDecimal value) {
            addCriterion("TRANSFER_AMOUNT >", value, "transferAmount");
            return (Criteria) this;
        }

        public Criteria andTransferAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TRANSFER_AMOUNT >=", value, "transferAmount");
            return (Criteria) this;
        }

        public Criteria andTransferAmountLessThan(BigDecimal value) {
            addCriterion("TRANSFER_AMOUNT <", value, "transferAmount");
            return (Criteria) this;
        }

        public Criteria andTransferAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TRANSFER_AMOUNT <=", value, "transferAmount");
            return (Criteria) this;
        }

        public Criteria andTransferAmountIn(List<BigDecimal> values) {
            addCriterion("TRANSFER_AMOUNT in", values, "transferAmount");
            return (Criteria) this;
        }

        public Criteria andTransferAmountNotIn(List<BigDecimal> values) {
            addCriterion("TRANSFER_AMOUNT not in", values, "transferAmount");
            return (Criteria) this;
        }

        public Criteria andTransferAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRANSFER_AMOUNT between", value1, value2, "transferAmount");
            return (Criteria) this;
        }

        public Criteria andTransferAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRANSFER_AMOUNT not between", value1, value2, "transferAmount");
            return (Criteria) this;
        }

        public Criteria andTransferRemarkIsNull() {
            addCriterion("TRANSFER_REMARK is null");
            return (Criteria) this;
        }

        public Criteria andTransferRemarkIsNotNull() {
            addCriterion("TRANSFER_REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andTransferRemarkEqualTo(String value) {
            addCriterion("TRANSFER_REMARK =", value, "transferRemark");
            return (Criteria) this;
        }

        public Criteria andTransferRemarkNotEqualTo(String value) {
            addCriterion("TRANSFER_REMARK <>", value, "transferRemark");
            return (Criteria) this;
        }

        public Criteria andTransferRemarkGreaterThan(String value) {
            addCriterion("TRANSFER_REMARK >", value, "transferRemark");
            return (Criteria) this;
        }

        public Criteria andTransferRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("TRANSFER_REMARK >=", value, "transferRemark");
            return (Criteria) this;
        }

        public Criteria andTransferRemarkLessThan(String value) {
            addCriterion("TRANSFER_REMARK <", value, "transferRemark");
            return (Criteria) this;
        }

        public Criteria andTransferRemarkLessThanOrEqualTo(String value) {
            addCriterion("TRANSFER_REMARK <=", value, "transferRemark");
            return (Criteria) this;
        }

        public Criteria andTransferRemarkLike(String value) {
            addCriterion("TRANSFER_REMARK like", value, "transferRemark");
            return (Criteria) this;
        }

        public Criteria andTransferRemarkNotLike(String value) {
            addCriterion("TRANSFER_REMARK not like", value, "transferRemark");
            return (Criteria) this;
        }

        public Criteria andTransferRemarkIn(List<String> values) {
            addCriterion("TRANSFER_REMARK in", values, "transferRemark");
            return (Criteria) this;
        }

        public Criteria andTransferRemarkNotIn(List<String> values) {
            addCriterion("TRANSFER_REMARK not in", values, "transferRemark");
            return (Criteria) this;
        }

        public Criteria andTransferRemarkBetween(String value1, String value2) {
            addCriterion("TRANSFER_REMARK between", value1, value2, "transferRemark");
            return (Criteria) this;
        }

        public Criteria andTransferRemarkNotBetween(String value1, String value2) {
            addCriterion("TRANSFER_REMARK not between", value1, value2, "transferRemark");
            return (Criteria) this;
        }

        public Criteria andOpenidIsNull() {
            addCriterion("OPENID is null");
            return (Criteria) this;
        }

        public Criteria andOpenidIsNotNull() {
            addCriterion("OPENID is not null");
            return (Criteria) this;
        }

        public Criteria andOpenidEqualTo(String value) {
            addCriterion("OPENID =", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotEqualTo(String value) {
            addCriterion("OPENID <>", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidGreaterThan(String value) {
            addCriterion("OPENID >", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidGreaterThanOrEqualTo(String value) {
            addCriterion("OPENID >=", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLessThan(String value) {
            addCriterion("OPENID <", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLessThanOrEqualTo(String value) {
            addCriterion("OPENID <=", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLike(String value) {
            addCriterion("OPENID like", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotLike(String value) {
            addCriterion("OPENID not like", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidIn(List<String> values) {
            addCriterion("OPENID in", values, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotIn(List<String> values) {
            addCriterion("OPENID not in", values, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidBetween(String value1, String value2) {
            addCriterion("OPENID between", value1, value2, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotBetween(String value1, String value2) {
            addCriterion("OPENID not between", value1, value2, "openid");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("USER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("USER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("USER_NAME =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("USER_NAME <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("USER_NAME >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("USER_NAME >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("USER_NAME <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("USER_NAME <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("USER_NAME like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("USER_NAME not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("USER_NAME in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("USER_NAME not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("USER_NAME between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("USER_NAME not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andDetailIdIsNull() {
            addCriterion("DETAIL_ID is null");
            return (Criteria) this;
        }

        public Criteria andDetailIdIsNotNull() {
            addCriterion("DETAIL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDetailIdEqualTo(String value) {
            addCriterion("DETAIL_ID =", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdNotEqualTo(String value) {
            addCriterion("DETAIL_ID <>", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdGreaterThan(String value) {
            addCriterion("DETAIL_ID >", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdGreaterThanOrEqualTo(String value) {
            addCriterion("DETAIL_ID >=", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdLessThan(String value) {
            addCriterion("DETAIL_ID <", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdLessThanOrEqualTo(String value) {
            addCriterion("DETAIL_ID <=", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdLike(String value) {
            addCriterion("DETAIL_ID like", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdNotLike(String value) {
            addCriterion("DETAIL_ID not like", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdIn(List<String> values) {
            addCriterion("DETAIL_ID in", values, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdNotIn(List<String> values) {
            addCriterion("DETAIL_ID not in", values, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdBetween(String value1, String value2) {
            addCriterion("DETAIL_ID between", value1, value2, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdNotBetween(String value1, String value2) {
            addCriterion("DETAIL_ID not between", value1, value2, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailStatusIsNull() {
            addCriterion("DETAIL_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andDetailStatusIsNotNull() {
            addCriterion("DETAIL_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andDetailStatusEqualTo(String value) {
            addCriterion("DETAIL_STATUS =", value, "detailStatus");
            return (Criteria) this;
        }

        public Criteria andDetailStatusNotEqualTo(String value) {
            addCriterion("DETAIL_STATUS <>", value, "detailStatus");
            return (Criteria) this;
        }

        public Criteria andDetailStatusGreaterThan(String value) {
            addCriterion("DETAIL_STATUS >", value, "detailStatus");
            return (Criteria) this;
        }

        public Criteria andDetailStatusGreaterThanOrEqualTo(String value) {
            addCriterion("DETAIL_STATUS >=", value, "detailStatus");
            return (Criteria) this;
        }

        public Criteria andDetailStatusLessThan(String value) {
            addCriterion("DETAIL_STATUS <", value, "detailStatus");
            return (Criteria) this;
        }

        public Criteria andDetailStatusLessThanOrEqualTo(String value) {
            addCriterion("DETAIL_STATUS <=", value, "detailStatus");
            return (Criteria) this;
        }

        public Criteria andDetailStatusLike(String value) {
            addCriterion("DETAIL_STATUS like", value, "detailStatus");
            return (Criteria) this;
        }

        public Criteria andDetailStatusNotLike(String value) {
            addCriterion("DETAIL_STATUS not like", value, "detailStatus");
            return (Criteria) this;
        }

        public Criteria andDetailStatusIn(List<String> values) {
            addCriterion("DETAIL_STATUS in", values, "detailStatus");
            return (Criteria) this;
        }

        public Criteria andDetailStatusNotIn(List<String> values) {
            addCriterion("DETAIL_STATUS not in", values, "detailStatus");
            return (Criteria) this;
        }

        public Criteria andDetailStatusBetween(String value1, String value2) {
            addCriterion("DETAIL_STATUS between", value1, value2, "detailStatus");
            return (Criteria) this;
        }

        public Criteria andDetailStatusNotBetween(String value1, String value2) {
            addCriterion("DETAIL_STATUS not between", value1, value2, "detailStatus");
            return (Criteria) this;
        }

        public Criteria andFailReasonIsNull() {
            addCriterion("FAIL_REASON is null");
            return (Criteria) this;
        }

        public Criteria andFailReasonIsNotNull() {
            addCriterion("FAIL_REASON is not null");
            return (Criteria) this;
        }

        public Criteria andFailReasonEqualTo(String value) {
            addCriterion("FAIL_REASON =", value, "failReason");
            return (Criteria) this;
        }

        public Criteria andFailReasonNotEqualTo(String value) {
            addCriterion("FAIL_REASON <>", value, "failReason");
            return (Criteria) this;
        }

        public Criteria andFailReasonGreaterThan(String value) {
            addCriterion("FAIL_REASON >", value, "failReason");
            return (Criteria) this;
        }

        public Criteria andFailReasonGreaterThanOrEqualTo(String value) {
            addCriterion("FAIL_REASON >=", value, "failReason");
            return (Criteria) this;
        }

        public Criteria andFailReasonLessThan(String value) {
            addCriterion("FAIL_REASON <", value, "failReason");
            return (Criteria) this;
        }

        public Criteria andFailReasonLessThanOrEqualTo(String value) {
            addCriterion("FAIL_REASON <=", value, "failReason");
            return (Criteria) this;
        }

        public Criteria andFailReasonLike(String value) {
            addCriterion("FAIL_REASON like", value, "failReason");
            return (Criteria) this;
        }

        public Criteria andFailReasonNotLike(String value) {
            addCriterion("FAIL_REASON not like", value, "failReason");
            return (Criteria) this;
        }

        public Criteria andFailReasonIn(List<String> values) {
            addCriterion("FAIL_REASON in", values, "failReason");
            return (Criteria) this;
        }

        public Criteria andFailReasonNotIn(List<String> values) {
            addCriterion("FAIL_REASON not in", values, "failReason");
            return (Criteria) this;
        }

        public Criteria andFailReasonBetween(String value1, String value2) {
            addCriterion("FAIL_REASON between", value1, value2, "failReason");
            return (Criteria) this;
        }

        public Criteria andFailReasonNotBetween(String value1, String value2) {
            addCriterion("FAIL_REASON not between", value1, value2, "failReason");
            return (Criteria) this;
        }

        public Criteria andInitiateTimeIsNull() {
            addCriterion("INITIATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andInitiateTimeIsNotNull() {
            addCriterion("INITIATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andInitiateTimeEqualTo(String value) {
            addCriterion("INITIATE_TIME =", value, "initiateTime");
            return (Criteria) this;
        }

        public Criteria andInitiateTimeNotEqualTo(String value) {
            addCriterion("INITIATE_TIME <>", value, "initiateTime");
            return (Criteria) this;
        }

        public Criteria andInitiateTimeGreaterThan(String value) {
            addCriterion("INITIATE_TIME >", value, "initiateTime");
            return (Criteria) this;
        }

        public Criteria andInitiateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("INITIATE_TIME >=", value, "initiateTime");
            return (Criteria) this;
        }

        public Criteria andInitiateTimeLessThan(String value) {
            addCriterion("INITIATE_TIME <", value, "initiateTime");
            return (Criteria) this;
        }

        public Criteria andInitiateTimeLessThanOrEqualTo(String value) {
            addCriterion("INITIATE_TIME <=", value, "initiateTime");
            return (Criteria) this;
        }

        public Criteria andInitiateTimeLike(String value) {
            addCriterion("INITIATE_TIME like", value, "initiateTime");
            return (Criteria) this;
        }

        public Criteria andInitiateTimeNotLike(String value) {
            addCriterion("INITIATE_TIME not like", value, "initiateTime");
            return (Criteria) this;
        }

        public Criteria andInitiateTimeIn(List<String> values) {
            addCriterion("INITIATE_TIME in", values, "initiateTime");
            return (Criteria) this;
        }

        public Criteria andInitiateTimeNotIn(List<String> values) {
            addCriterion("INITIATE_TIME not in", values, "initiateTime");
            return (Criteria) this;
        }

        public Criteria andInitiateTimeBetween(String value1, String value2) {
            addCriterion("INITIATE_TIME between", value1, value2, "initiateTime");
            return (Criteria) this;
        }

        public Criteria andInitiateTimeNotBetween(String value1, String value2) {
            addCriterion("INITIATE_TIME not between", value1, value2, "initiateTime");
            return (Criteria) this;
        }

        public Criteria andDetailUpdateTimeIsNull() {
            addCriterion("DETAIL_UPDATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andDetailUpdateTimeIsNotNull() {
            addCriterion("DETAIL_UPDATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andDetailUpdateTimeEqualTo(String value) {
            addCriterion("DETAIL_UPDATE_TIME =", value, "detailUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDetailUpdateTimeNotEqualTo(String value) {
            addCriterion("DETAIL_UPDATE_TIME <>", value, "detailUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDetailUpdateTimeGreaterThan(String value) {
            addCriterion("DETAIL_UPDATE_TIME >", value, "detailUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDetailUpdateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("DETAIL_UPDATE_TIME >=", value, "detailUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDetailUpdateTimeLessThan(String value) {
            addCriterion("DETAIL_UPDATE_TIME <", value, "detailUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDetailUpdateTimeLessThanOrEqualTo(String value) {
            addCriterion("DETAIL_UPDATE_TIME <=", value, "detailUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDetailUpdateTimeLike(String value) {
            addCriterion("DETAIL_UPDATE_TIME like", value, "detailUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDetailUpdateTimeNotLike(String value) {
            addCriterion("DETAIL_UPDATE_TIME not like", value, "detailUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDetailUpdateTimeIn(List<String> values) {
            addCriterion("DETAIL_UPDATE_TIME in", values, "detailUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDetailUpdateTimeNotIn(List<String> values) {
            addCriterion("DETAIL_UPDATE_TIME not in", values, "detailUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDetailUpdateTimeBetween(String value1, String value2) {
            addCriterion("DETAIL_UPDATE_TIME between", value1, value2, "detailUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDetailUpdateTimeNotBetween(String value1, String value2) {
            addCriterion("DETAIL_UPDATE_TIME not between", value1, value2, "detailUpdateTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIsNull() {
            addCriterion("CREATED_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIsNotNull() {
            addCriterion("CREATED_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeEqualTo(Date value) {
            addCriterion("CREATED_TIME =", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotEqualTo(Date value) {
            addCriterion("CREATED_TIME <>", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThan(Date value) {
            addCriterion("CREATED_TIME >", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATED_TIME >=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThan(Date value) {
            addCriterion("CREATED_TIME <", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATED_TIME <=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIn(List<Date> values) {
            addCriterion("CREATED_TIME in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotIn(List<Date> values) {
            addCriterion("CREATED_TIME not in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeBetween(Date value1, Date value2) {
            addCriterion("CREATED_TIME between", value1, value2, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATED_TIME not between", value1, value2, "createdTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeIsNull() {
            addCriterion("UPDATED_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeIsNotNull() {
            addCriterion("UPDATED_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeEqualTo(Date value) {
            addCriterion("UPDATED_TIME =", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeNotEqualTo(Date value) {
            addCriterion("UPDATED_TIME <>", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeGreaterThan(Date value) {
            addCriterion("UPDATED_TIME >", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATED_TIME >=", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeLessThan(Date value) {
            addCriterion("UPDATED_TIME <", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeLessThanOrEqualTo(Date value) {
            addCriterion("UPDATED_TIME <=", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeIn(List<Date> values) {
            addCriterion("UPDATED_TIME in", values, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeNotIn(List<Date> values) {
            addCriterion("UPDATED_TIME not in", values, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeBetween(Date value1, Date value2) {
            addCriterion("UPDATED_TIME between", value1, value2, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeNotBetween(Date value1, Date value2) {
            addCriterion("UPDATED_TIME not between", value1, value2, "updatedTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}