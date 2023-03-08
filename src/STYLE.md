# Style

---

## Apply Constraints
### Multiple constraints
```
function function_name<T, U, V>(arg1: T, arg2: U, arg3: V) -> T where
        T: std::iterable && std::copyable,
        U: std::bitwiseable && std::logical
        V: std::convirtible<T>
        !: arg1.size() > 1:
    ... 
```

### Single constraint
```
function function_name<T>(arg1: T) -> T
where T: std::iterable && std::copyable:
    ... 
```

