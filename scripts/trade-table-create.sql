CREATE TABLE trade (
  id        VARCHAR(100),
  acountId  INT8,
  tradeId   INT8,
  cusip     VARCHAR(10),
  units     INT4,
  tradeDate DATE,
  action    VARCHAR(10),
  amount    INT8
);