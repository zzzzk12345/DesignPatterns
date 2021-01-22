package jianDanGongChang;

/**
 * @author zhangkai
 * @date 22/1/21
 */
public enum Operator {
    // 加法
    //ADD("ADD", "+", new OperationImplAdd()),
    ADD("ADD", "+", new AbstractOperation() {
        @Override
        public Double operate(double num1, double num2) {
            return num1+num2;
        }
    }),

    // 减法
    //SUB("SUB", "-", new OperationImplSub()),
    SUB("SUB", "-", new AbstractOperation() {
        @Override
        public Double operate(double num1, double num2) {
            return num1-num2;
        }
    }),


    // 乘法
    MUL("MUL", "*", new AbstractOperation() {
        @Override
        public Double operate(double num1, double num2) {
            return num1*num2;
        }
    }),

    // 除法
    DIV("DIV", "/", new AbstractOperation() {
        @Override
        public Double operate(double num1, double num2) {
            if (num2 == 0) {
                return null;
            } else {
                return num1/num2;
            }
        }
    }),

    ;


    /**
     * 关联操作
     */
    private final AbstractOperation operation;
    /**
     * 枚举名称
     */
    private final String name;

    /**
     * 枚举符号
     */
    private final String desc;

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    public AbstractOperation getOperation() {
        return operation;
    }

    Operator(String name, String desc, AbstractOperation operation) {
        this.name = name;
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
