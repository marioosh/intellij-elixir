// This is a generated file. Not intended for manual editing.
package org.elixir_lang.psi.impl;

import com.ericsson.otp.erlang.OtpErlangObject;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import org.elixir_lang.psi.ElixirMatchedNoParenthesesArguments;
import org.elixir_lang.psi.ElixirMatchedUnqualifiedNoParenthesesCall;
import org.elixir_lang.psi.ElixirVisitor;
import org.jetbrains.annotations.NotNull;

public class ElixirMatchedUnqualifiedNoParenthesesCallImpl extends ElixirMatchedExpressionImpl implements ElixirMatchedUnqualifiedNoParenthesesCall {

  public ElixirMatchedUnqualifiedNoParenthesesCallImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ElixirVisitor) ((ElixirVisitor)visitor).visitMatchedUnqualifiedNoParenthesesCall(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public ElixirMatchedNoParenthesesArguments getMatchedNoParenthesesArguments() {
    return findNotNullChildByClass(ElixirMatchedNoParenthesesArguments.class);
  }

  @NotNull
  public OtpErlangObject quote() {
    return ElixirPsiImplUtil.quote(this);
  }

}
