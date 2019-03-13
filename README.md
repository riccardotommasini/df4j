# Dataframe For Java

## Constructor
DataFrame([data, index, columns, dtype, copy])	Two-dimensional size-mutable, potentially heterogeneous tabular data structure with labeled axes (rows and columns).

## Attributes and underlying data Axes

- [] DataFrame.index	The index (row labels) of the DataFrame.

- [] DataFrame.columns	The column labels of the DataFrame.

- [] DataFrame.dtypes	Return the dtypes in the DataFrame.

- [] DataFrame.ftypes	Return the ftypes (indication of sparse/dense and dtype) in DataFrame.

- [] DataFrame.get_dtype_counts()	Return counts of unique dtypes in this object.

- [] DataFrame.get_ftype_counts()	(DEPRECATED) Return counts of unique ftypes in this object.

- [] DataFrame.select_dtypes([include, exclude])	Return a subset of the DataFrame’s columns based on the column dtypes.

- [] DataFrame.values	Return a Numpy representation of the DataFrame.

- [] DataFrame.get_values()	Return an ndarray after converting sparse values to dense.

- [] DataFrame.axes	Return a list representing the axes of the DataFrame.

- [] DataFrame.ndim	Return an int representing the number of axes / array dimensions.

- [] DataFrame.size	Return an int representing the number of elements in this object.

- [] DataFrame.shape	Return a tuple representing the dimensionality of the DataFrame.

- [] DataFrame.memory_usage([index, deep])	Return the memory usage of each column in bytes.

- [] DataFrame.empty	Indicator whether DataFrame is empty.

- [] DataFrame.is_copy	Return the copy.

## Conversion
DataFrame.astype(dtype[, copy, errors])	Cast a pandas object to a specified dtype dtype.
DataFrame.convert_objects([convert_dates, …])	(DEPRECATED) Attempt to infer better dtype for object columns.
DataFrame.infer_objects()	Attempt to infer better dtypes for object columns.
DataFrame.copy([deep])	Make a copy of this object’s indices and data.
DataFrame.isna()	Detect missing values.
DataFrame.notna()	Detect existing (non-missing) values.
DataFrame.bool()	Return the bool of a single element PandasObject.

## Indexing, iteration
DataFrame.head([n])	Return the first n rows.
DataFrame.at	Access a single value for a row/column label pair.
DataFrame.iat	Access a single value for a row/column pair by integer position.
DataFrame.loc	Access a group of rows and columns by label(s) or a boolean array.
DataFrame.iloc	Purely integer-location based indexing for selection by position.
DataFrame.insert(loc, column, value[, …])	Insert column into DataFrame at specified location.
DataFrame.__iter__()	Iterate over infor axis
DataFrame.items()	Iterator over (column name, Series) pairs.
DataFrame.keys()	Get the ‘info axis’ (see Indexing for more)
DataFrame.iteritems()	Iterator over (column name, Series) pairs.
DataFrame.iterrows()	Iterate over DataFrame rows as (index, Series) pairs.
DataFrame.itertuples([index, name])	Iterate over DataFrame rows as namedtuples.
DataFrame.lookup(row_labels, col_labels)	Label-based “fancy indexing” function for DataFrame.
DataFrame.pop(item)	Return item and drop from frame.
DataFrame.tail([n])	Return the last n rows.
DataFrame.xs(key[, axis, level, drop_level])	Return cross-section from the Series/DataFrame.
DataFrame.get(key[, default])	Get item from object for given key (DataFrame column, Panel slice, etc.).
DataFrame.isin(values)	Whether each element in the DataFrame is contained in values.
DataFrame.where(cond[, other, inplace, …])	Replace values where the condition is False.
DataFrame.mask(cond[, other, inplace, axis, …])	Replace values where the condition is True.
DataFrame.query(expr[, inplace])	Query the columns of a DataFrame with a boolean expression.
For more information on .at, .iat, .loc, and .iloc, see the indexing documentation.

##  Binary operator functions
DataFrame.add(other[, axis, level, fill_value])	Addition of dataframe and other, element-wise (binary operator add).
DataFrame.sub(other[, axis, level, fill_value])	Subtraction of dataframe and other, element-wise (binary operator sub).
DataFrame.mul(other[, axis, level, fill_value])	Multiplication of dataframe and other, element-wise (binary operator mul).
DataFrame.div(other[, axis, level, fill_value])	Floating division of dataframe and other, element-wise (binary operator truediv).
DataFrame.truediv(other[, axis, level, …])	Floating division of dataframe and other, element-wise (binary operator truediv).
DataFrame.floordiv(other[, axis, level, …])	Integer division of dataframe and other, element-wise (binary operator floordiv).
DataFrame.mod(other[, axis, level, fill_value])	Modulo of dataframe and other, element-wise (binary operator mod).
DataFrame.pow(other[, axis, level, fill_value])	Exponential power of dataframe and other, element-wise (binary operator pow).
DataFrame.dot(other)	Compute the matrix mutiplication between the DataFrame and other.
DataFrame.radd(other[, axis, level, fill_value])	Addition of dataframe and other, element-wise (binary operator radd).
DataFrame.rsub(other[, axis, level, fill_value])	Subtraction of dataframe and other, element-wise (binary operator rsub).
DataFrame.rmul(other[, axis, level, fill_value])	Multiplication of dataframe and other, element-wise (binary operator rmul).
DataFrame.rdiv(other[, axis, level, fill_value])	Floating division of dataframe and other, element-wise (binary operator rtruediv).
DataFrame.rtruediv(other[, axis, level, …])	Floating division of dataframe and other, element-wise (binary operator rtruediv).
DataFrame.rfloordiv(other[, axis, level, …])	Integer division of dataframe and other, element-wise (binary operator rfloordiv).
DataFrame.rmod(other[, axis, level, fill_value])	Modulo of dataframe and other, element-wise (binary operator rmod).
DataFrame.rpow(other[, axis, level, fill_value])	Exponential power of dataframe and other, element-wise (binary operator rpow).
DataFrame.lt(other[, axis, level])	Less than of dataframe and other, element-wise (binary operator lt).
DataFrame.gt(other[, axis, level])	Greater than of dataframe and other, element-wise (binary operator gt).
DataFrame.le(other[, axis, level])	Less than or equal to of dataframe and other, element-wise (binary operator le).
DataFrame.ge(other[, axis, level])	Greater than or equal to of dataframe and other, element-wise (binary operator ge).
DataFrame.ne(other[, axis, level])	Not equal to of dataframe and other, element-wise (binary operator ne).
DataFrame.eq(other[, axis, level])	Equal to of dataframe and other, element-wise (binary operator eq).
DataFrame.combine(other, func[, fill_value, …])	Perform column-wise combine with another DataFrame based on a passed function.
DataFrame.combine_first(other)	Update null elements with value in the same location in other.
Function application, GroupBy & Window
DataFrame.apply(func[, axis, broadcast, …])	Apply a function along an axis of the DataFrame.
DataFrame.applymap(func)	Apply a function to a Dataframe elementwise.
DataFrame.pipe(func, *args, **kwargs)	Apply func(self, *args, **kwargs). 
DataFrame.agg(func[, axis])	Aggregate using one or more operations over the specified axis.
DataFrame.aggregate(func[, axis])	Aggregate using one or more operations over the specified axis.
DataFrame.transform(func[, axis])	Call func on self producing a DataFrame with transformed values and that has the same axis length as self.
DataFrame.groupby([by, axis, level, …])	Group DataFrame or Series using a mapper or by a Series of columns.
DataFrame.rolling(window[, min_periods, …])	Provides rolling window calculations.
DataFrame.expanding([min_periods, center, axis])	Provides expanding transformations.
DataFrame.ewm([com, span, halflife, alpha, …])	Provides exponential weighted functions.
Computations / Descriptive Stats
DataFrame.abs()	Return a Series/DataFrame with absolute numeric value of each element.
DataFrame.all([axis, bool_only, skipna, level])	Return whether all elements are True, potentially over an axis.
DataFrame.any([axis, bool_only, skipna, level])	Return whether any element is True, potentially over an axis.
DataFrame.clip([lower, upper, axis, inplace])	Trim values at input threshold(s).
DataFrame.clip_lower(threshold[, axis, inplace])	(DEPRECATED) Trim values below a given threshold.
DataFrame.clip_upper(threshold[, axis, inplace])	(DEPRECATED) Trim values above a given threshold.
DataFrame.compound([axis, skipna, level])	Return the compound percentage of the values for the requested axis.
DataFrame.corr([method, min_periods])	Compute pairwise correlation of columns, excluding NA/null values.
DataFrame.corrwith(other[, axis, drop, method])	Compute pairwise correlation between rows or columns of DataFrame with rows or columns of Series or DataFrame.
DataFrame.count([axis, level, numeric_only])	Count non-NA cells for each column or row.
DataFrame.cov([min_periods])	Compute pairwise covariance of columns, excluding NA/null values.
DataFrame.cummax([axis, skipna])	Return cumulative maximum over a DataFrame or Series axis.
DataFrame.cummin([axis, skipna])	Return cumulative minimum over a DataFrame or Series axis.
DataFrame.cumprod([axis, skipna])	Return cumulative product over a DataFrame or Series axis.
DataFrame.cumsum([axis, skipna])	Return cumulative sum over a DataFrame or Series axis.
DataFrame.describe([percentiles, include, …])	Generate descriptive statistics that summarize the central tendency, dispersion and shape of a dataset’s distribution, excluding NaN values.
DataFrame.diff([periods, axis])	First discrete difference of element.
DataFrame.eval(expr[, inplace])	Evaluate a string describing operations on DataFrame columns.
DataFrame.kurt([axis, skipna, level, …])	Return unbiased kurtosis over requested axis using Fisher’s definition of kurtosis (kurtosis of normal == 0.0).
DataFrame.kurtosis([axis, skipna, level, …])	Return unbiased kurtosis over requested axis using Fisher’s definition of kurtosis (kurtosis of normal == 0.0).
DataFrame.mad([axis, skipna, level])	Return the mean absolute deviation of the values for the requested axis.
DataFrame.max([axis, skipna, level, …])	Return the maximum of the values for the requested axis.
DataFrame.mean([axis, skipna, level, …])	Return the mean of the values for the requested axis.
DataFrame.median([axis, skipna, level, …])	Return the median of the values for the requested axis.
DataFrame.min([axis, skipna, level, …])	Return the minimum of the values for the requested axis.
DataFrame.mode([axis, numeric_only, dropna])	Get the mode(s) of each element along the selected axis.
DataFrame.pct_change([periods, fill_method, …])	Percentage change between the current and a prior element.
DataFrame.prod([axis, skipna, level, …])	Return the product of the values for the requested axis.
DataFrame.product([axis, skipna, level, …])	Return the product of the values for the requested axis.
DataFrame.quantile([q, axis, numeric_only, …])	Return values at the given quantile over requested axis.
DataFrame.rank([axis, method, numeric_only, …])	Compute numerical data ranks (1 through n) along axis.
DataFrame.round([decimals])	Round a DataFrame to a variable number of decimal places.
DataFrame.sem([axis, skipna, level, ddof, …])	Return unbiased standard error of the mean over requested axis.
DataFrame.skew([axis, skipna, level, …])	Return unbiased skew over requested axis Normalized by N-1.
DataFrame.sum([axis, skipna, level, …])	Return the sum of the values for the requested axis.
DataFrame.std([axis, skipna, level, ddof, …])	Return sample standard deviation over requested axis.
DataFrame.var([axis, skipna, level, ddof, …])	Return unbiased variance over requested axis.
DataFrame.nunique([axis, dropna])	Count distinct observations over requested axis.
## Reindexing / Selection / Label manipulation
DataFrame.add_prefix(prefix)	Prefix labels with string prefix.
DataFrame.add_suffix(suffix)	Suffix labels with string suffix.
DataFrame.align(other[, join, axis, level, …])	Align two objects on their axes with the specified join method for each axis Index.
DataFrame.at_time(time[, asof, axis])	Select values at particular time of day (e.g.
DataFrame.between_time(start_time, end_time)	Select values between particular times of the day (e.g., 9:00-9:30 AM).
DataFrame.drop([labels, axis, index, …])	Drop specified labels from rows or columns.
DataFrame.drop_duplicates([subset, keep, …])	Return DataFrame with duplicate rows removed, optionally only considering certain columns.
DataFrame.duplicated([subset, keep])	Return boolean Series denoting duplicate rows, optionally only considering certain columns.
DataFrame.equals(other)	Test whether two objects contain the same elements.
DataFrame.filter([items, like, regex, axis])	Subset rows or columns of dataframe according to labels in the specified index.
DataFrame.first(offset)	Convenience method for subsetting initial periods of time series data based on a date offset.
DataFrame.head([n])	Return the first n rows.
DataFrame.idxmax([axis, skipna])	Return index of first occurrence of maximum over requested axis.
DataFrame.idxmin([axis, skipna])	Return index of first occurrence of minimum over requested axis.
DataFrame.last(offset)	Convenience method for subsetting final periods of time series data based on a date offset.
DataFrame.reindex([labels, index, columns, …])	Conform DataFrame to new index with optional filling logic, placing NA/NaN in locations having no value in the previous index.
DataFrame.reindex_axis(labels[, axis, …])	(DEPRECATED) Conform input object to new index.
DataFrame.reindex_like(other[, method, …])	Return an object with matching indices as other object.
DataFrame.rename([mapper, index, columns, …])	Alter axes labels.
DataFrame.rename_axis([mapper, index, …])	Set the name of the axis for the index or columns.
DataFrame.reset_index([level, drop, …])	Reset the index, or a level of it.
DataFrame.sample([n, frac, replace, …])	Return a random sample of items from an axis of object.
DataFrame.select(crit[, axis])	(DEPRECATED) Return data corresponding to axis labels matching criteria.
DataFrame.set_axis(labels[, axis, inplace])	Assign desired index to given axis.
DataFrame.set_index(keys[, drop, append, …])	Set the DataFrame index using existing columns.
DataFrame.tail([n])	Return the last n rows.
DataFrame.take(indices[, axis, convert, is_copy])	Return the elements in the given positional indices along an axis.
DataFrame.truncate([before, after, axis, copy])	Truncate a Series or DataFrame before and after some index value.
Missing data handling
DataFrame.dropna([axis, how, thresh, …])	Remove missing values.
DataFrame.fillna([value, method, axis, …])	Fill NA/NaN values using the specified method.
DataFrame.replace([to_replace, value, …])	Replace values given in to_replace with value.
DataFrame.interpolate([method, axis, limit, …])	Interpolate values according to different methods.
Reshaping, sorting, transposing
DataFrame.droplevel(level[, axis])	Return DataFrame with requested index / column level(s) removed.
DataFrame.pivot([index, columns, values])	Return reshaped DataFrame organized by given index / column values.
DataFrame.pivot_table([values, index, …])	Create a spreadsheet-style pivot table as a DataFrame.
DataFrame.reorder_levels(order[, axis])	Rearrange index levels using input order.
DataFrame.sort_values(by[, axis, ascending, …])	Sort by the values along either axis
DataFrame.sort_index([axis, level, …])	Sort object by labels (along an axis)
DataFrame.nlargest(n, columns[, keep])	Return the first n rows ordered by columns in descending order.
DataFrame.nsmallest(n, columns[, keep])	Return the first n rows ordered by columns in ascending order.
DataFrame.swaplevel([i, j, axis])	Swap levels i and j in a MultiIndex on a particular axis.
DataFrame.stack([level, dropna])	Stack the prescribed level(s) from columns to index.
DataFrame.unstack([level, fill_value])	Pivot a level of the (necessarily hierarchical) index labels, returning a DataFrame having a new level of column labels whose inner-most level consists of the pivoted index labels.
DataFrame.swapaxes(axis1, axis2[, copy])	Interchange axes and swap values axes appropriately.
DataFrame.melt([id_vars, value_vars, …])	Unpivots a DataFrame from wide format to long format, optionally leaving identifier variables set.
DataFrame.squeeze([axis])	Squeeze 1 dimensional axis objects into scalars.
DataFrame.to_panel()	(DEPRECATED) Transform long (stacked) format (DataFrame) into wide (3D, Panel) format.
DataFrame.to_xarray()	Return an xarray object from the pandas object.
DataFrame.T	Transpose index and columns.
DataFrame.transpose(*args, **kwargs)	Transpose index and columns.
Combining / joining / merging
DataFrame.append(other[, ignore_index, …])	Append rows of other to the end of caller, returning a new object.
DataFrame.assign(**kwargs)	Assign new columns to a DataFrame.
DataFrame.join(other[, on, how, lsuffix, …])	Join columns of another DataFrame.
DataFrame.merge(right[, how, on, left_on, …])	Merge DataFrame or named Series objects with a database-style join.
DataFrame.update(other[, join, overwrite, …])	Modify in place using non-NA values from another DataFrame.
Time series-related
DataFrame.asfreq(freq[, method, how, …])	Convert TimeSeries to specified frequency.
DataFrame.asof(where[, subset])	Return the last row(s) without any NaNs before where.
DataFrame.shift([periods, freq, axis, …])	Shift index by desired number of periods with an optional time freq.
DataFrame.slice_shift([periods, axis])	Equivalent to shift without copying data.
DataFrame.tshift([periods, freq, axis])	Shift the time index, using the index’s frequency if available.
DataFrame.first_valid_index()	Return index for first non-NA/null value.
DataFrame.last_valid_index()	Return index for last non-NA/null value.
DataFrame.resample(rule[, how, axis, …])	Resample time-series data.
DataFrame.to_period([freq, axis, copy])	Convert DataFrame from DatetimeIndex to PeriodIndex with desired frequency (inferred from index if not passed).
DataFrame.to_timestamp([freq, how, axis, copy])	Cast to DatetimeIndex of timestamps, at beginning of period.

- [] DataFrame.tz_convert(tz[, axis, level, copy])	Convert tz-aware axis to target time zone.

- [] DataFrame.tz_localize(tz[, axis, level, …])	Localize tz-naive index of a Series or DataFrame to target time zone.

## Plotting
DataFrame.plot is both a callable method and a namespace attribute for specific plotting methods of the form DataFrame.plot.<kind>.

DataFrame.plot([x, y, kind, ax, ….])	DataFrame plotting accessor and method
DataFrame.plot.area([x, y])	Draw a stacked area plot.
DataFrame.plot.bar([x, y])	Vertical bar plot.
DataFrame.plot.barh([x, y])	Make a horizontal bar plot.
DataFrame.plot.box([by])	Make a box plot of the DataFrame columns.
DataFrame.plot.density([bw_method, ind])	Generate Kernel Density Estimate plot using Gaussian kernels.
DataFrame.plot.hexbin(x, y[, C, …])	Generate a hexagonal binning plot.
DataFrame.plot.hist([by, bins])	Draw one histogram of the DataFrame’s columns.
DataFrame.plot.kde([bw_method, ind])	Generate Kernel Density Estimate plot using Gaussian kernels.
DataFrame.plot.line([x, y])	Plot DataFrame columns as lines.
DataFrame.plot.pie([y])	Generate a pie plot.
DataFrame.plot.scatter(x, y[, s, c])	Create a scatter plot with varying marker point size and color.
DataFrame.boxplot([column, by, ax, …])	Make a box plot from DataFrame columns.
DataFrame.hist([column, by, grid, …])	Make a histogram of the DataFrame’s.

## Serialization / IO / Conversion
DataFrame.from_csv(path[, header, sep, …])	(DEPRECATED) Read CSV file.
DataFrame.from_dict(data[, orient, dtype, …])	Construct DataFrame from dict of array-like or dicts.
DataFrame.from_items(items[, columns, orient])	(DEPRECATED) Construct a DataFrame from a list of tuples.
DataFrame.from_records(data[, index, …])	Convert structured or record ndarray to DataFrame.
DataFrame.info([verbose, buf, max_cols, …])	Print a concise summary of a DataFrame.
DataFrame.to_parquet(fname[, engine, …])	Write a DataFrame to the binary parquet format.
DataFrame.to_pickle(path[, compression, …])	Pickle (serialize) object to file.
DataFrame.to_csv([path_or_buf, sep, na_rep, …])	Write object to a comma-separated values (csv) file.
DataFrame.to_hdf(path_or_buf, key, **kwargs)	Write the contained data to an HDF5 file using HDFStore.
DataFrame.to_sql(name, con[, schema, …])	Write records stored in a DataFrame to a SQL database.
DataFrame.to_dict([orient, into])	Convert the DataFrame to a dictionary.
DataFrame.to_excel(excel_writer[, …])	Write object to an Excel sheet.
DataFrame.to_json([path_or_buf, orient, …])	Convert the object to a JSON string.
DataFrame.to_html([buf, columns, col_space, …])	Render a DataFrame as an HTML table.
DataFrame.to_feather(fname)	Write out the binary feather-format for DataFrames.
DataFrame.to_latex([buf, columns, …])	Render an object to a LaTeX tabular environment table.
DataFrame.to_stata(fname[, convert_dates, …])	Export DataFrame object to Stata dta format.
DataFrame.to_msgpack([path_or_buf, encoding])	Serialize object to input file path using msgpack format.
DataFrame.to_gbq(destination_table[, …])	Write a DataFrame to a Google BigQuery table.
DataFrame.to_records([index, …])	Convert DataFrame to a NumPy record array.
DataFrame.to_sparse([fill_value, kind])	Convert to SparseDataFrame.
DataFrame.to_dense()	Return dense representation of NDFrame (as opposed to sparse).
DataFrame.to_string([buf, columns, …])	Render a DataFrame to a console-friendly tabular output.
DataFrame.to_clipboard([excel, sep])	Copy object to the system clipboard.
DataFrame.style	Property returning a Styler object containing methods for building a styled HTML representation fo the DataFrame.
Sparse
SparseDataFrame.to_coo()	Return the contents of the frame as a sparse SciPy COO matrix.
