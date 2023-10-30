package com.oguz.stock.common.usecase;

import com.oguz.stock.common.model.UseCase;

public interface UseCaseHandler<R,T extends UseCase> {
    R handle(T useCase);
}
