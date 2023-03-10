package core.basesyntax.service.impl;

import core.basesyntax.service.ProcessDataFromOrder;
import java.util.List;
import java.util.stream.Collectors;

public class ProcessDataFromOrderImpl implements ProcessDataFromOrder {
    private static final String SYMBOL_TO_SPLIT = ",";

    @Override
    public List<String[]> split(List<String> order) {
        if (order == null) {
            throw new RuntimeException("List couldn't be null");
        } else if (order.isEmpty()) {
            throw new RuntimeException("List couldn't be empty");
        }
        return order.stream()
                .map(o -> o.split(SYMBOL_TO_SPLIT))
                .collect(Collectors.toList());
    }
}
