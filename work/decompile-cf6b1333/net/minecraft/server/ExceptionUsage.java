package net.minecraft.server;

public class ExceptionUsage extends ExceptionInvalidSyntax {

    public ExceptionUsage(String s, Object... aobject) {
        super(s, aobject);
    }

    public synchronized Throwable fillInStackTrace() {
        return this;
    }
}
