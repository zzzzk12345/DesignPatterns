package gongchangmoshi.jianDanGongChang;

/**
 * @author zhangkai
 * @date 22/1/21
 */
public enum Operator {
    // 加法
    ADD("+", new AbstractOperation() {
        @Override
        public Double operate(double num1, double num2) {
            return num1 + num2;
        }
    }),

    // 减法
    SUB("-", new AbstractOperation() {
        @Override
        public Double operate(double num1, double num2) {
            return num1 - num2;
        }
    }),


    // 乘法
    MUL("*", new AbstractOperation() {
        @Override
        public Double operate(double num1, double num2) {
            return num1 * num2;
        }
    }),

    // 除法
    DIV("/", new AbstractOperation() {
        @Override
        public Double operate(double num1, double num2) {
            if (num2 == 0) {
                return null;
            } else {
                return num1 / num2;
            }
        }
    }),

    ;

    /**
     * 关联操作
     */
    private final AbstractOperation operation;

    /**
     * 枚举符号
     */
    private final String desc;


    public String getDesc() {
        return desc;
    }

    public AbstractOperation getOperation() {
        return operation;
    }

    Operator(String desc, AbstractOperation operation) {
        this.desc = desc;
        this.operation = operation;
    }

    public static Operator getOperator(String desc) {
        for (Operator op : Operator.values()) {
            if (desc.equals(op.getDesc())) {
                return op;
            }
        }
        return null;
    }

}
